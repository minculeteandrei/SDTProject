package Lab2.ChainOfResponsability;

import java.sql.Timestamp;

public class SensorEvent {
    EventType type;
    Timestamp timestamp;
    String location;

    public SensorEvent(EventType type, Timestamp timestamp, String location) {
        this.type = type;
        this.timestamp = timestamp;
        this.location = location;
    }
}
