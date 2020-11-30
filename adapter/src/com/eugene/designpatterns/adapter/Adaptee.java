package com.eugene.designpatterns.adapter;

public class Adaptee {

    public void methodA() {
        System.out.println("methodA");
    }

    public void methodB(Object param) {
        System.out.println("methodB: " + param.toString());
    }
}
