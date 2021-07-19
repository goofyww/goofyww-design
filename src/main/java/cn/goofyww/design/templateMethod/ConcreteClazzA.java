package cn.goofyww.design.templateMethod;

public class ConcreteClazzA extends AbstractClazz {

    @Override
    protected void primitiveOperation1() {
        System.out.println("具体类 A 方法1实现");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("具体类 A 方法2实现");
    }

}
