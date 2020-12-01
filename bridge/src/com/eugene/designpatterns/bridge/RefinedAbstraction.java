package com.eugene.designpatterns.bridge;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    public void operation() {
        System.out.println("RefinedAbstraction.operation");
    }

}
