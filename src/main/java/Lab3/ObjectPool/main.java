package Lab3.ObjectPool;

public class main {
    public static void main(String[] args) {
        try {
            DbConnection db1 = ObjectPool.getInstance().get();
            System.out.println(db1.mock);
            DbConnection db2 = ObjectPool.getInstance().get();
            System.out.println(db2.mock);
            DbConnection db3 = ObjectPool.getInstance().get();
            System.out.println(db3.mock);
            DbConnection db4 = ObjectPool.getInstance().get();
            System.out.println(db4.mock);
            DbConnection db5 = ObjectPool.getInstance().get();
            System.out.println(db5.mock);
//            ObjectPool.release(db1);
            DbConnection db6= ObjectPool.getInstance().get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
