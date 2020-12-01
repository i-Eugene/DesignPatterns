package com.eugene.designpatterns.bridge;

public class RefinedAbstraction2 extends Abstraction {

    public RefinedAbstraction2(Implementor impl) {
        super(impl);
    }

    public void operation2() {
        System.out.println("RefinedAbstraction2.operation2");
    }

}
