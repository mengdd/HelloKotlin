package classes.singleton;

/**
 * 单例实现方法3: 用synchronized关键字保证线程安全.
 * <p>
 * 缺点: 会降低性能. 即便对象已经被创建, 仍然多次进行同步.
 */
public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}