package com.eugene.designpatterns.strategry;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextMethod(double a, double b) {
        strategy.method(a, b);
    }
}
