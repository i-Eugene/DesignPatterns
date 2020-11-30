package com.eugene.designpatterns.abstractfactory.factory;

public abstract class AbsProduct2 implements Product, Test {
    public abstract void onOperation1();

    public abstract void onOperation2();

    public abstract void onOperation3();

    @Override
    public void test() {
        System.out.println("AbsProduct2.test");
    }

    @Override
    public void printName() {
        System.out.println("AbsProduct2.printName");
    }
}
