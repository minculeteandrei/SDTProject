package project_design_patterns.services;

import com.sun.nio.file.SensitivityWatchEventModifier;

import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

public class NotificationService implements Runnable{
    private Path workingDir;
    private WatchService watcher;

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

            while(true) {
                WatchKey key = this.watcher.take();
                for (WatchEvent<?> event : key.pollEvents()) {
                    if (event.kind() == StandardWatchEventKinds.OVERFLOW)
                        continue;
                    Path fileName = (Path) event.context();
                    System.out.println("file changed: " + fileName);
                }

                if (!key.reset()) {
                    break;
                }
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
