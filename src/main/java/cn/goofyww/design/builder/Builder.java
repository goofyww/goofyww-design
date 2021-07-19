package cn.goofyww.design.builder;

public abstract class Builder<T> {

    protected T node;

    public abstract void buildPartA();

    public abstract void buildPartB();

    public T getResult() {
        return node;
    }

}
