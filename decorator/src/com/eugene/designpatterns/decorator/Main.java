package com.eugene.designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent("Hello Design Patterns");
        Decorator decorator = new ConcreteDecorator(component, '+');
        Decorator decorator1 = new ConcreteDecorator(decorator, '#');
        Decorator decorator2 = new ConcreteDecorator(decorator1, '-');
        for (int i = 0; i < decorator2.getRowCount(); i++) {
            System.out.println(decorator2.getRowText(i));
        }
    }
}
