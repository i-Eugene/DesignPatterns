package com.eugene.designpatterns.chainofresponsibility;

public class ConcreteHandler2 extends Handler {

    public ConcreteHandler2(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(int data) {
        boolean isResolve = data % 2 == 1;
        if (isResolve) {
            System.out.println(getName() + " " + data);
        }
        return isResolve;
    }
}
