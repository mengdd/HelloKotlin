package classes.singleton;

/**
 * 单例实现方法2: 将实例化操作提前.
 * 在静态初始化的时候创建实例, 保证线程安全.
 * <p>
 * 缺点: 如果从来未使用过, 初始化是一种浪费.
 */
public class Singleton2 {

    private static Singleton2 instance = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}