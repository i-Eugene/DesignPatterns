package com.eugene.designpatterns.templatemethod;

public class ConcreteClass1 extends AbstractClass {

    public ConcreteClass1(String s) {
        super(s);
    }

    @Override
    protected void method1() {
        System.out.print("+");
        for (int i = 0; i < string.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    protected void method2() {
        System.out.println("|"+string+"|");
    }

    @Override
    protected void method3() {
        method1();
    }
}
