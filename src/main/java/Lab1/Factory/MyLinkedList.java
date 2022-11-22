package Lab1.Factory;

import java.util.LinkedList;

public class MyLinkedList implements MyList {
    private LinkedList<Integer> list;

    public MyLinkedList() {
        this.list = new LinkedList<>();
    }
    @Override
    public void add(int num) {
        this.list.add(num);
    }

    @Override
    public int get(int index) {
        return this.list.get(index);
    }
}
