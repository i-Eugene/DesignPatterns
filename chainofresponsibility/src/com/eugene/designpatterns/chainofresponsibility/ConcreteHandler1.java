package com.eugene.designpatterns.chainofresponsibility;

public class ConcreteHandler1 extends Handler {

    public ConcreteHandler1(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(int data) {
        boolean isResolve = data % 2 == 0;
        if (isResolve) {
            System.out.println(getName() + " " + data);
        }
        return isResolve;
    }
}
