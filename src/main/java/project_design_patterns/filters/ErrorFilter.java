package project_design_patterns.filters;

import project_design_patterns.domain.Message;

public class ErrorFilter extends Filter{

    @Override
    public void handle(Message message) {

        message.setError(message.getError().replace("y", ""));
        this.next.handle(message);
    }
}
