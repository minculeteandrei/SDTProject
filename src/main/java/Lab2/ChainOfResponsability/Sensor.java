package Lab2.ChainOfResponsability;

public class Sensor implements Runnable{

    SensorEvent fireEvent;
    SensorEvent intrusionEvent;
    SensorEvent waterEvent;

    NotificationServices handler;

    public Sensor(SensorEvent fireEvent, SensorEvent intrusionEvent, SensorEvent waterEvent, NotificationServices handler) {
        this.fireEvent = fireEvent;
        this.intrusionEvent = intrusionEvent;
        this.waterEvent = waterEvent;
        this.handler = handler;
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    @Override
    public void run() {
        while (true) {
            int random = this.getRandomNumber(1, 3);
            switch (random) {
                case 1 -> handler.handle(fireEvent);
                case 2 -> handler.handle(intrusionEvent);
                case 3 -> handler.handle(waterEvent);
            }
        }
    }
}
