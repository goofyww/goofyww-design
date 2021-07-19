package cn.goofyww.design.templateMethod;

/**
 * 模版方法模式，
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。
 * 模版方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。【DP】
 */
public class TemplateMethodApp {

    public static void main(String[] args) {
        AbstractClazz x;
        x = new ConcreteClazzA();
        x.templateMethod();

        x = new ConcreteClazzB();
        x.templateMethod();
    }
    
}
