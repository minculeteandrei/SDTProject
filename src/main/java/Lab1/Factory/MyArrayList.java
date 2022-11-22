package Lab1.Factory;

import java.util.ArrayList;

public class MyArrayList implements MyList {
    private ArrayList<Integer> array;

    public MyArrayList() {
        this.array = new ArrayList<>();
    }
    @Override
    public void add(int num) {
        this.array.add(num);
    }

    @Override
    public int get(int index) {
        return this.array.get(index);
    }
}
