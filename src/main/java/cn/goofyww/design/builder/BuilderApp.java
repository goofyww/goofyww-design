package cn.goofyww.design.builder;

/**
 * 建造者模式，
 * Builder: 是为创建一个 Product 对象的各个部件指定的抽象接口
 * ConcreteBuilder: 具体建造者，实现 Builder 接口，构建和装配各个部件
 * Product: 具体的构建对象
 * Director: 指挥者，用于构建是一个使用 Builder 接口的对象
 * 总结：
 * 用于创建一些复杂的对象，这些对象内部构建之间的构造顺序通常是稳定的，但对象内部的构建通常面临着复杂的变化。
 * 建造者模式的好处就是使得 建造代码 与 表示代码 分离，由于建造者隐藏类该产品是如何组装的，所以若需要改变一个产品的内部表示时，只需要再定义一个具体的建造者就可以。
 * 建造者模式 是在当 【创建复杂对象的算法】应该 【独立于】该对象的【组成部分】以及它们的【装配方式】 时适用的模式
 */
public class BuilderApp {

    public static void main(String[] args) {

        Director director = new Director();

        Builder<Product> a = new ConcreteBuilderA();
        director.construct(a);
        Product pA = a.getResult();
        pA.show();

        Builder<Product> b = new ConcreteBuilderB();
        director.construct(b);
        Product pB = b.getResult();
        pB.show();
    }

}
