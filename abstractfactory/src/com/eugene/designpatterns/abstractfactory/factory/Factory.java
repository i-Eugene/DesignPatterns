package com.eugene.designpatterns.abstractfactory.factory;

import com.eugene.designpatterns.abstractfactory.concretefactory.ConcreteFactory;

public interface Factory {
    String FACTORY_1 = "factory_1";
    String FACTORY_2 = "factory_2";

    Product createProduct1();

    Product createProduct2();

    AbsProduct3 createProduct3();

    static Factory getFactory(String factory) {
        Factory f = null;
        switch (factory) {
            case FACTORY_1:
                f = new ConcreteFactory();

        }
        return f;
    }
}
