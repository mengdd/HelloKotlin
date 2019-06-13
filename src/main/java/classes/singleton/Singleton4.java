package classes.singleton;

/**
 * 单例实现方法4: 双重加锁检查.
 * 只有实例尚未创建才会进行同步.
 * <p>
 * 缺点: 写起来复杂.
 */
public class Singleton4 {

    private volatile static Singleton4 instance; //volatile关键字保证可见性, 字段被访问时用的都是共享值, 而不是缓存拷贝

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) { //进入块之后会再检查一次
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}