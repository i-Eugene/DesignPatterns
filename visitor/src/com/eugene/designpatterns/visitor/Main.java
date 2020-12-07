package com.eugene.designpatterns.visitor;

/**
 * demo中复用了Composite模式中部分代码
 * 同时使用Visitor模式替换Composite模式中printList方法对数据结构中的元素进行输出。
 */
public class Main {
    public static void main(String[] args) {
        ConcreteElementB composite = new ConcreteElementB("Eugene Root");
        composite.add(new ConcreteElementB("Eugene 1"));
        ConcreteElementB c1 = new ConcreteElementB("Eugene 2");
        ConcreteElementB c2 = new ConcreteElementB("Eugene 6");
        c2.add(new ConcreteElementA("Eugene 9"));
        c1.add(c2);
        c1.add(new ConcreteElementB("Eugene 7"));
        c1.add(new ConcreteElementA("Eugene 8"));
        composite.add(c1);
        composite.add(new ConcreteElementA("Eugene 3"));
        composite.add(new ConcreteElementA("Eugene 4"));
        composite.add(new ConcreteElementB("Eugene 5"));

        composite.accept(new ConcreteVisitor(), "-");
    }
}
