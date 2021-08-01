package cn.goofyww.design.single;

/**
 * 单例模式
 * 线程安全，静态内部类版
 */
public class SingletonFactory {

    private SingletonFactory() {
    }

    private static class Singleton {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return Singleton.instance;
    }


}
