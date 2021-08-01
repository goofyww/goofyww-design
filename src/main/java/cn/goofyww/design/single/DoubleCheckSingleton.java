package cn.goofyww.design.single;

/**
 * 单例模式
 * 线程安全，双重检查懒汉版
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton singleton;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }


}
