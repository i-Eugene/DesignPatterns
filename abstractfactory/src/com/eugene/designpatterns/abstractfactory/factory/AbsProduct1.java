package com.eugene.designpatterns.abstractfactory.factory;

public abstract class AbsProduct1 implements Product, Test {
    public abstract void doOperation1();

    public abstract void doOperation2();

    public abstract void doOperation3();

    @Override
    public void test() {
        System.out.println("AbsProduct1.test");
    }

    @Override
    public void printName() {
        System.out.println("AbsProduct1.printName");
    }
}
