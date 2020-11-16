package com.eugene.design_patterns.factory_mothod;

import com.eugene.design_patterns.factory_mothod.framework.Product;

public class ConcreteProduct extends Product {
    private String param;

    public ConcreteProduct(String param) {
        this.param = param;
    }

    @Override
    public void printName() {
        System.out.println(param);
    }
}
