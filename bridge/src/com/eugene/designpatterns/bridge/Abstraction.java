package com.eugene.designpatterns.bridge;

public abstract class Abstraction {
    protected Implementor impl;

    public Abstraction(Implementor impl) {
        this.impl = impl;
    }

    public final void method1() {
        System.out.print("Abstraction.method1 called ");
        this.impl.rawMethod1();
    }

    public final void method2() {
        System.out.print("Abstraction.method2 called ");
        this.impl.rawMethod2();
    }

    public final void method3() {
        System.out.print("Abstraction.method3 called ");
        this.impl.rawMethod3();
    }
}
