package com.eugene.designpatterns.bridge;

public class ConcreteImplementor1 implements Implementor {
    @Override
    public void rawMethod1() {
        System.out.println("ConcreteImplementor.rawMethod1");
    }

    @Override
    public void rawMethod2() {
        System.out.println("ConcreteImplementor.rawMethod2");
    }

    @Override
    public void rawMethod3() {
        System.out.println("ConcreteImplementor.rawMethod3");
    }
}
