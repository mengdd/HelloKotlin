package classes.singleton;

/**
 * 单例实现方法1:
 * <p>
 * 缺点: 多线程的情况存在问题, 可能会创建出多个对象.
 */
public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}


