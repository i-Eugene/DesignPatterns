package com.eugene.designpatterns.abstractfactory.factory;

public abstract class AbsProduct3 implements Product {
    public abstract void excOperation1();

    public abstract void excOperation2();

    public abstract void excOperation3();

    @Override
    public void printName() {
        System.out.println("AbsProduct3.printName");
    }
}
