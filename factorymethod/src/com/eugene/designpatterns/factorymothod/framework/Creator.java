package com.eugene.designpatterns.factorymothod.framework;

public abstract class Creator {
    public final Product create(String param) {
        return factoryMethod(param);
    }

    protected abstract Product factoryMethod(String param);
}
