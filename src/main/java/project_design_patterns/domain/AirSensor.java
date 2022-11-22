package project_design_patterns.domain;

import java.io.*;
import java.util.Random;

public class AirSensor implements Runnable{
    private File dataFile;
    private FileWriter fw;
    private BufferedWriter bw;

    public AirSensor(String dataFilePath) {
        this.dataFile = new File(dataFilePath);
    }

    public String generateRandomData() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();

        // generate random length between 10 and 20
        int targetStringLength = 10 + (int) (random.nextFloat() * (20 - 10 + 1));
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }

        return buffer.toString();
    }

    @Override
    public void run() {
        try {
            System.out.println("Sensor started recording data");
            while(true) {
                this.fw = new FileWriter(this.dataFile, true);
                this.bw = new BufferedWriter(fw);
                this.bw.write(this.generateRandomData());
                this.bw.newLine();
                this.bw.flush();
                this.bw.close();
                Thread.sleep(2000);
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
