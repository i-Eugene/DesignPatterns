package com.eugene.designpatterns.proxy;

public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void method1() {
        realize();
        realSubject.method1();
    }

    @Override
    public void method2() {
        realize();
        realSubject.method2();
    }

    private synchronized void realize() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
    }
}
