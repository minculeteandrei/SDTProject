package project_design_patterns.filters;

import project_design_patterns.domain.Message;

public class DataFilter extends Filter{
    @Override
    public void handle(Message message) {
        message.setData(message.getData().replace("x", ""));
        this.next.handle(message);
    }
}
