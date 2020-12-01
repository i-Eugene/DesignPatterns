package com.eugene.designpatterns.strategry;

public class ConcreteStrategy1 implements Strategy {

    @Override
    public void method(double a, double b) {
        System.out.println("a + b = " + (a + b));
    }
}
