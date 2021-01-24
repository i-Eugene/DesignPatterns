package com.eugene.designpatterns.proxy;

public class RealSubject implements Subject {
    @Override
    public void method1() {
        System.out.println("RealSubject.method1");
    }

    @Override
    public void method2() {
        System.out.println("RealSubject.method2");
    }

    public void method3(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("RealSubject.method3");
        }
    }
}
