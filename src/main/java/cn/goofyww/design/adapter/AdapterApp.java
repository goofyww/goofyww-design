package cn.goofyww.design.adapter;

/**
 * 适配器模式，
 * 总结：将一个类的接口转换成客户希望的另外一个接口。
 * Adapter 模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。【DP】
 */
public class AdapterApp {

    public static void main(String[] args) {

        Target target = new Adapter();
        target.request();
        System.out.println("-------");

    }

}
