package cn.goofyww.design.builder;

public class ConcreteBuilderA extends Builder<Product> {

    public ConcreteBuilderA(){
        node = new Product();
    }

    @Override
    public void buildPartA() {
        node.add("部件A");
    }

    @Override
    public void buildPartB() {
        node.add("部件B");
    }

}
