package Lab1.Factory;

public class MyListFactory {
    public static MyList getList(ListType list){
        switch (list) {
            case MyArrayList -> {
                return new MyArrayList();
            }
            case MyLinkedList -> {
                return new MyLinkedList();
            }
        }
        return new MySynchronizedList();
    }
}
