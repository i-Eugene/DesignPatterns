package com.eugene.designpatterns.state;

public class ConcreteState1 implements State {
    private static ConcreteState1 singleton = new ConcreteState1();

    private ConcreteState1() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void method1(Context context, int data) {
        if (data <= 5) {
            context.changeState(ConcreteState2.getInstance());
        }
        System.out.println("ConcreteState1.method1 " + data);
    }

    @Override
    public void method2() {
        System.out.println("ConcreteState1.method2");
    }
}
