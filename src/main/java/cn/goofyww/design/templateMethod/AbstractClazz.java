package cn.goofyww.design.templateMethod;

/**
 * 模版方法抽象基类
 * 抽象模版
 * 实现了一个模版方法的，定义算法的骨架，
 * 具体子类将重定义 PrimitiveOperation 方法，以实现一个算法的步骤
 */
public abstract class AbstractClazz {

    protected abstract void primitiveOperation1();

    protected abstract void primitiveOperation2();

    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("------");
    }

}
