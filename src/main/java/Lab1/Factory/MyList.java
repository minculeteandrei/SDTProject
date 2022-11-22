package Lab1.Factory;

public interface MyList {
    void add(int num);
    int get(int index);
    static MyList getList(ListType list) {
        return MyListFactory.getList(list);
    }
}
