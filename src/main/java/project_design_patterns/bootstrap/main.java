package project_design_patterns.bootstrap;

import project_design_patterns.connections.Connection;
import project_design_patterns.connections.ConnectionType;
import project_design_patterns.domain.AirSensor;
import project_design_patterns.domain.Message;
import project_design_patterns.services.NotificationService;

public class main {
    public static void main(String[] args) {
        /*Thread sensor1 = new Thread(new AirSensor("C:\\Users\\mincu\\OneDrive\\Documents\\Teme_si_documente\\An4Sem1\\SDT\\SDT\\src\\main\\java\\project_design_patterns\\data.txt"));
        Thread notifService1 = new Thread(new NotificationService("C:\\Users\\mincu\\OneDrive\\Documents\\Teme_si_documente\\An4Sem1\\SDT\\SDT\\src\\main\\java\\project_design_patterns"));

        notifService1.start();
        sensor1.start();*/

        Connection f = Connection.getConnection(ConnectionType.File);
        f.write(new Message.MessageBuilder("File connection test").error("Test 3").warning("Test 3").build());

        Connection l = Connection.getConnection(ConnectionType.LoggingService);
        l.write(new Message.MessageBuilder("Logging service connection test").error("Test 3").warning("Test 3").build());
    }
}
