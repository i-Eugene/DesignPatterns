package com.eugene.designpatterns.abstractfactory.concretefactory;

import com.eugene.designpatterns.abstractfactory.factory.AbsProduct1;

public class ConcreteProduct1 extends AbsProduct1 {
    @Override
    public void doOperation1() {
        System.out.println("ConcreteProduct1.doOperation1");
    }

    @Override
    public void doOperation2() {
        System.out.println("ConcreteProduct1.doOperation2");
    }

    @Override
    public void doOperation3() {
        System.out.println("ConcreteProduct1.doOperation3");
    }
}
