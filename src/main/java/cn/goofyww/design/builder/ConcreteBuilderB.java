package cn.goofyww.design.builder;

public class ConcreteBuilderB extends Builder<Product> {

    public ConcreteBuilderB() {
        node = new Product();
    }

    @Override
    public void buildPartA() {
        node.add("部件X");
    }

    @Override
    public void buildPartB() {
        node.add("部件Y");
    }

}
