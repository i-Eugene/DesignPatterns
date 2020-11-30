package com.eugene.designpatterns.abstractfactory.concretefactory;

import com.eugene.designpatterns.abstractfactory.factory.*;

public class ConcreteFactory extends AbsFactory {
    @Override
    public Product createProduct1() {
        return new ConcreteProduct1();
    }

    @Override
    public AbsProduct2 createProduct2() {
        return new ConcreteProduct2();
    }

    @Override
    public AbsProduct3 createProduct3() {
        return new ConcreteProduct3();
    }
}
