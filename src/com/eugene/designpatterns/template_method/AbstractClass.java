package com.eugene.designpatterns.template_method;

public abstract class AbstractClass {
    protected String string;

    public AbstractClass(String s) {
        this.string = s;
    }

    protected abstract void method1();

    protected abstract void method2();

    protected abstract void method3();

    public void templateMethod() {
        method1();
        method2();
        method3();
    }
}
