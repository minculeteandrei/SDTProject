package project_design_patterns.services;

import com.sun.nio.file.SensitivityWatchEventModifier;
import project_design_patterns.domain.Message;
import project_design_patterns.domain.Subscribee;

import javax.annotation.processing.Filer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

public class NotificationService implements Runnable{
    private Path workingDir;
    private WatchService watcher;
    private FileReader fr;
    private BufferedReader bw;
    private Message mb;
    private List<Subscribee> subscribers = new ArrayList<>();

    public NotificationService(String workingDir) {
        this.workingDir = Paths.get(workingDir);
    }

    @Override
    public void run() {
        System.out.println("Service started!");
        try {
            this.watcher = FileSystems.getDefault().newWatchService();
            this.workingDir.register(this.watcher, new WatchEvent.Kind[]{StandardWatchEventKinds.ENTRY_MODIFY},
                    SensitivityWatchEventModifier.HIGH);
            String modif = null;

            while(true) {
                WatchKey key = this.watcher.take();
                for (WatchEvent<?> event : key.pollEvents()) {
                    if (event.kind() == StandardWatchEventKinds.OVERFLOW)
                        continue;
                    Path fileName = (Path) event.context();

                    this.fr = new FileReader(this.workingDir.toString() + '\\' + fileName.toString());
                    this.bw = new BufferedReader(fr);

                    while (bw.ready())
                        modif = bw.readLine();
                    Message newMessage = new Message.MessageBuilder(modif).warning("warning");
                    this.signal(newMessage);
                    bw.close();

//                    System.out.println("file changed: " + fileName);
                }

                if (!key.reset()) {
                    break;
                }
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void subscribe(Subscribee subscribee) {
        this.subscribers.add(subscribee);
    }

    private void signal(Message m){
        this.subscribers.forEach(subscribee -> subscribee.doNow(m));
    }
}
