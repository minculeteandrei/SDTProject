package project_design_patterns.connections;

import project_design_patterns.domain.Message;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileConnection extends Connection{
    @Override
    public void write(Message message) {
        try {
            FileWriter fw = new FileWriter("src/main/java/project_design_patterns/writes/file.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(message.toString());
            bw.newLine();
            bw.flush();
            bw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
