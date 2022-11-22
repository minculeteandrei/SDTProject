package Lab1.Factory;

public class mainDecorator {
    public static void main(String[] args) {
        LoggingDecorator loggedList = new LoggingDecorator(MyListFactory.getList(ListType.MyArrayList));
        loggedList.add(5);
    }
}
