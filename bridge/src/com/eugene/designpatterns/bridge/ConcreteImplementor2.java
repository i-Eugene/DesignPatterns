package com.eugene.designpatterns.bridge;

public class ConcreteImplementor2 implements Implementor {
    @Override
    public void rawMethod1() {
        System.out.println("ConcreteImplementor2.rawMethod1");
    }

    @Override
    public void rawMethod2() {
        System.out.println("ConcreteImplementor2.rawMethod2");
    }

    @Override
    public void rawMethod3() {
        System.out.println("ConcreteImplementor2.rawMethod3");
    }
}
