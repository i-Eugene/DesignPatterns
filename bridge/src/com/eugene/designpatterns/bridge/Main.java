package com.eugene.designpatterns.bridge;

public class Main {
    public static void main(String[] args) {
        RefinedAbstraction abstraction = new RefinedAbstraction(new ConcreteImplementor1());
        abstraction.method1();
        abstraction.method2();
        abstraction.method3();
        abstraction.operation();
        System.out.println("-----------------------------------");
        RefinedAbstraction2 abstraction2 = new RefinedAbstraction2(new ConcreteImplementor2());
        abstraction2.method1();
        abstraction2.method2();
        abstraction2.method3();
        abstraction2.operation2();
    }
}
