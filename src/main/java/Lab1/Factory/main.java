package Lab1.Factory;

public class main {
    public static void main(String[] args) {
        MyList arrayList =
                MyList.getList(ListType.MyArrayList);
        arrayList.add(5);
        System.out.print(arrayList.get(0));
        MyList linkedList =
                MyList.getList(ListType.MyLinkedList);
        linkedList.add(7);
        System.out.print(linkedList.get(0));
        MyList syncList =
                MyList.getList(ListType.MySynchronizedList);
        syncList.add(9);
        System.out.print(syncList.get(0));
    }
}
