package Lab2.ChainOfResponsability;

public class TelephoneNotification extends NotificationServices{
    @Override
    public void handle(SensorEvent sensorEvent) {
        if (sensorEvent.type.equals(EventType.FIRE) || sensorEvent.type.equals(EventType.INTRUSION)) {
            System.out.println("A call was made for event" + sensorEvent.type + " " + sensorEvent.location +
                    " " + sensorEvent.timestamp);
        }

        this.next.handle(sensorEvent);
    }
}
