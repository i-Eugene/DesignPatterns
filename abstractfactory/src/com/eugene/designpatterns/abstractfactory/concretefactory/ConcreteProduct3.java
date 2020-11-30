package com.eugene.designpatterns.abstractfactory.concretefactory;

import com.eugene.designpatterns.abstractfactory.factory.AbsProduct3;

public class ConcreteProduct3 extends AbsProduct3 {
    @Override
    public void excOperation1() {
        System.out.println("ConcreteProduct3.excOperation1");
    }

    @Override
    public void excOperation2() {
        System.out.println("ConcreteProduct3.excOperation2");
    }

    @Override
    public void excOperation3() {
        System.out.println("ConcreteProduct3.excOperation3");
    }
}
