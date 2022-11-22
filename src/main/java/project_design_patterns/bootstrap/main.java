package project_design_patterns.bootstrap;

import project_design_patterns.domain.AirSensor;
import project_design_patterns.services.NotificationService;

public class main {
    public static void main(String[] args) {
        Thread sensor1 = new Thread(new AirSensor("C:\\Users\\mincu\\OneDrive\\Documents\\Teme_si_documente\\An4Sem1\\SDT\\SDT\\src\\main\\java\\project_design_patterns\\data.txt"));
        Thread notifService1 = new Thread(new NotificationService("C:\\Users\\mincu\\OneDrive\\Documents\\Teme_si_documente\\An4Sem1\\SDT\\SDT\\src\\main\\java\\project_design_patterns"));

        notifService1.start();
        sensor1.start();

    }
}
