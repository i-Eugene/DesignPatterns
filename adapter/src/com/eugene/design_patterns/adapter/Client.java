package com.eugene.design_patterns.adapter;

public class Client {
    public static void main(String[] args) {
        Target target = new AdapterExtends();
        target.targetMethod1();
        target.targetMethod2("param ... extends");

        System.out.println("----------------------------");

        target = new AdapterHas(new Adaptee());
        target.targetMethod1();
        target.targetMethod2("param ... has");
    }
}
