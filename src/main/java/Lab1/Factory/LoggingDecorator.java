package Lab1.Factory;

public class LoggingDecorator implements MyList {
    private final MyList list;

    public LoggingDecorator(MyList list) {
        this.list = list;
    }

    @Override
    public void add(int num) {
        list.add(num);
        System.out.println("added" + num);
    }

    @Override
    public int get(int index) {
        return list.get(index);
    }
}