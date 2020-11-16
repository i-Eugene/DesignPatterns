package com.eugene.design_patterns.factory_mothod.framework;

public abstract class Creator {
    public final Product create(String param) {
        return factoryMethod(param);
    }

    protected abstract Product factoryMethod(String param);
}
