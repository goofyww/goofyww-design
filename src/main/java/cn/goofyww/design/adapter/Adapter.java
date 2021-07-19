package cn.goofyww.design.adapter;

/**
 * 通过在内部包装一个 Adapter 对象，把源接口转换为目标接口
 */
public class Adapter extends Target {

    private final Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }

}
