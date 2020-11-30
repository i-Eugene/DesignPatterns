package com.eugene.designpatterns.factorymothod;

import com.eugene.designpatterns.factorymothod.framework.Creator;
import com.eugene.designpatterns.factorymothod.framework.Product;

public class ConcreteCreator extends Creator {

    @Override
    protected Product factoryMethod(String param) {
        return new ConcreteProduct(param);
    }
}
