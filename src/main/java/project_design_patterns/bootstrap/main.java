package project_design_patterns.bootstrap;

import project_design_patterns.connections.Connection;
import project_design_patterns.connections.ConnectionType;
import project_design_patterns.domain.AirSensor;
import project_design_patterns.domain.Message;
import project_design_patterns.domain.Router;
import project_design_patterns.filters.DataFilter;
import project_design_patterns.filters.ErrorFilter;
import project_design_patterns.filters.Filter;
import project_design_patterns.filters.WarningFilter;
import project_design_patterns.services.NotificationService;

public class main {
    public static void main(String[] args) {
        Thread sensor1 = new Thread(new AirSensor("src\\main\\java\\project_design_patterns\\data.txt"));

        Filter df = new DataFilter();
        Filter wf = new WarningFilter();
        Filter ef = new ErrorFilter();
        df.setNext(ef);
        ef.setNext(wf);

        Router router = new Router(df);
        NotificationService notificationService =  new NotificationService("src\\main\\java\\project_design_patterns");
        notificationService.subscribe(router);

        Thread notifServiceThread = new Thread(notificationService);

        notifServiceThread.start();
        sensor1.start();

    }
}
