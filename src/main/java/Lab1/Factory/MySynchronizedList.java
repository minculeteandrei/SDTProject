package Lab1.Factory;

import java.util.ArrayList;

public class MySynchronizedList implements MyList {
    private ArrayList<Integer> array;

    public MySynchronizedList() {
        this.array = new ArrayList<>();
    }
    @Override
    public synchronized void add(int num) {
        this.array.add(num);
    }

    @Override
    public synchronized int get(int index) {
        return this.array.get(index);
    }
}
