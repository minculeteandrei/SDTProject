package Lab2.ChainOfResponsability;

public class Logger extends NotificationServices{
    @Override
    public void handle(SensorEvent sensorEvent) {
        System.out.println("event" + sensorEvent.type + " " + sensorEvent.location +
                " " + sensorEvent.timestamp + "was logged");
    }
}
