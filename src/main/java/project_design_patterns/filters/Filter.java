package project_design_patterns.filters;

import project_design_patterns.domain.Message;

public abstract class Filter {
    protected Filter next;



    public void setNext(Filter handler) {this.next = handler;}

    public abstract void handle(Message message);
}
