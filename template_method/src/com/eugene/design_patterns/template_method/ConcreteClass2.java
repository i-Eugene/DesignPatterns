package com.eugene.design_patterns.template_method;

public class ConcreteClass2 extends AbstractClass {

    public ConcreteClass2(String s) {
        super(s);
    }

    @Override
    protected void method1() {
        System.out.print("<<");
    }

    @Override
    protected void method2() {
        System.out.print(string);
    }

    @Override
    protected void method3() {
        System.out.println(">>");
    }
}