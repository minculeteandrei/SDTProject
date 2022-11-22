package project_design_patterns.domain;

import project_design_patterns.connections.Connection;
import project_design_patterns.connections.ConnectionType;
import project_design_patterns.connections.FileConnection;
import project_design_patterns.connections.LoggingServiceConnection;
import project_design_patterns.filters.Filter;

public class Router implements Subscribee {
    Filter dataFilter;
    FileConnection fileConnection;
    LoggingServiceConnection loggingServiceConnection;

    public Router(Filter dataFilter) {
        this.dataFilter = dataFilter;
        this.fileConnection = (FileConnection) Connection.getConnection(ConnectionType.File);
        this.loggingServiceConnection = (LoggingServiceConnection) Connection.getConnection(ConnectionType.LoggingService);
    }

    @Override
    public void doNow(Message m) {
        this.dataFilter.handle(m);
        this.fileConnection.write(m);
        this.loggingServiceConnection.write(m);
    }
}
