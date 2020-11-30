package com.eugene.designpatterns.abstractfactory.factory;

import com.eugene.designpatterns.abstractfactory.concretefactory.ConcreteFactory;

public abstract class AbsFactory implements Factory {
    public static final String FACTORY_1 = "factory_1";
    public static final String FACTORY_2 = "factory_2";

    public static AbsFactory getFactory(String factory) {
        AbsFactory absFactory = null;
        switch (factory) {
            case FACTORY_1:
                absFactory = new ConcreteFactory();

        }
        return absFactory;
    }
}
