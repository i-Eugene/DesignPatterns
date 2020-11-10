package com.eugene.design_patterns.adapter;

public class Adaptee {

    public void methodA() {
        System.out.println("methodA");
    }

    public void methodB(Object param) {
        System.out.println("methodB: " + param.toString());
    }
}
