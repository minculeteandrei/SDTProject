package Lab3.ObjectPool;

import java.util.LinkedList;
import java.util.Queue;

public class ObjectPool {
    private static ObjectPool instance;
    private Queue<DbConnection> pool;
    private int limit;

    private ObjectPool() {
        this.pool = new LinkedList<>();
    }

    public DbConnection get() throws Exception {
        if(this.pool.size() == this.limit) {
            throw new Exception("Maximum limit of opened connections reached. Please release a connection");
        }
        DbConnection temp = new DbConnection();
        this.pool.add(temp);
        return temp;
    }

    public static void release(DbConnection r) {
        ObjectPool.getInstance().pool.poll();
    }

    public static ObjectPool getInstance() {
        if(ObjectPool.instance == null) {
            ObjectPool.instance = new ObjectPool();
            ObjectPool.instance.limit = 5;
        }

        return ObjectPool.instance;
    }

    public static void setLimit(int limit) {
        ObjectPool.getInstance().limit = limit;
    }
}
