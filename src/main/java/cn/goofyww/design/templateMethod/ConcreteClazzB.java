package cn.goofyww.design.templateMethod;

public class ConcreteClazzB extends AbstractClazz {

    @Override
    protected void primitiveOperation1() {
        System.out.println("具体类 B 方法1实现");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("具体类 B 方法2实现");
    }

}
