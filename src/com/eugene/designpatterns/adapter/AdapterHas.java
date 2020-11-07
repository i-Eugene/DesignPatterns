package com.eugene.designpatterns.adapter;

public class AdapterHas implements Target {
    private Adaptee adaptee;

    public AdapterHas(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void targetMethod1() {
        adaptee.methodA();
    }

    @Override
    public void targetMethod2(Object param) {
        adaptee.methodB(param);
    }
}
