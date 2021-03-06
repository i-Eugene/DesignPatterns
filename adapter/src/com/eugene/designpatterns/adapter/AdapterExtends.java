package com.eugene.designpatterns.adapter;

public class AdapterExtends extends Adaptee implements Target {

    @Override
    public void targetMethod1() {
        methodA();
    }

    @Override
    public void targetMethod2(Object param) {
        methodB(param);
    }
}
