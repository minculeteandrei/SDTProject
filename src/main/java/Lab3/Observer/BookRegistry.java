package Lab3.Observer;

import java.util.List;

public class BookRegistry {
    private List<Observer> observers;

    public void subscribe(Observer obs) {
        this.observers.add(obs);
    }

    public void unsubscribe(Observer obs) {
        this.observers.remove(obs);
    }


}
