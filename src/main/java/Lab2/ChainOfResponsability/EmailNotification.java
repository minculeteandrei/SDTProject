package Lab2.ChainOfResponsability;

public class EmailNotification extends NotificationServices{
    @Override
    public void handle(SensorEvent sensorEvent) {
        if (sensorEvent.type.equals(EventType.FIRE) || sensorEvent.type.equals(EventType.INTRUSION) || sensorEvent.type.equals(EventType.WATER)) {
            System.out.println("Email was sent for event" + sensorEvent.type + " " + sensorEvent.location +
                    " " + sensorEvent.timestamp);
        }

        this.next.handle(sensorEvent);


    }
}
