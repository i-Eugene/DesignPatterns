package com.eugene.designpatterns.abstractfactory.concretefactory;

import com.eugene.designpatterns.abstractfactory.factory.AbsProduct2;

public class ConcreteProduct2 extends AbsProduct2 {
    @Override
    public void onOperation1() {
        System.out.println("ConcreteProduct2.onOperation1");
    }

    @Override
    public void onOperation2() {
        System.out.println("ConcreteProduct2.onOperation2");
    }

    @Override
    public void onOperation3() {
        System.out.println("ConcreteProduct2.onOperation3");
    }

    @Override
    public void printName() {
        System.out.println("ConcreteProduct2.printName");
    }
}
