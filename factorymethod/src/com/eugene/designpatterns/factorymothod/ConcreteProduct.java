package com.eugene.designpatterns.factorymothod;

import com.eugene.designpatterns.factorymothod.framework.Product;

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
