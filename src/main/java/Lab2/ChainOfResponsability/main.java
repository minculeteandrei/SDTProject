package Lab2.ChainOfResponsability;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        SensorEvent fireEvent = new SensorEvent(EventType.FIRE, new Timestamp(new Date().getTime()), "address 1");
        SensorEvent intrusionEvent = new SensorEvent(EventType.INTRUSION, new Timestamp(new Date().getTime()), "address 2");
        SensorEvent waterEvent = new SensorEvent(EventType.WATER, new Timestamp(new Date().getTime()), "address 3");
        NotificationServices emailNotification = new EmailNotification();
        NotificationServices telNotification = new TelephoneNotification();
        NotificationServices logger = new Logger();
        emailNotification.setNext(telNotification);
        telNotification.setNext(logger);

        Thread sensor = new Thread(new Sensor(fireEvent, intrusionEvent, waterEvent, emailNotification));
        sensor.start();

    }
}
