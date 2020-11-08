package com.eugene.designpatterns.template_method;

public class Main {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass1("Template Method");
        abstractClass.templateMethod();
        System.out.println();
        abstractClass = new ConcreteClass2("Template Method");
        abstractClass.templateMethod();
    }
}
