package project_design_patterns.filters;

import project_design_patterns.domain.Message;

public class WarningFilter extends Filter{
    @Override
    public void handle(Message message) {
        message.setWarning(message.getWarning().replace("z", ""));
    }
}
