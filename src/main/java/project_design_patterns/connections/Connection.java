package project_design_patterns.connections;

import project_design_patterns.domain.Message;

public abstract class Connection {
    public static Connection getConnection(ConnectionType type){
        return switch (type) {
            case File -> new FileConnection();
            case LoggingService -> new LoggingServiceConnection();
        };
    }
    public abstract void write(Message message);
}
