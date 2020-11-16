package com.eugene.design_patterns.factory_mothod;

import com.eugene.design_patterns.factory_mothod.framework.Creator;
import com.eugene.design_patterns.factory_mothod.framework.Product;

public class ConcreteCreator extends Creator {

    @Override
    protected Product factoryMethod(String param) {
        return new ConcreteProduct(param);
    }
}
