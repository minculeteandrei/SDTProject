package Lab2.ChainOfResponsability;

public abstract class NotificationServices {
    protected NotificationServices next;

    public void setNext(NotificationServices handler) {
        this.next = handler;
    }

    public abstract void handle(SensorEvent sensorEvent);
}
