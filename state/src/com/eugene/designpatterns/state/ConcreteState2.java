package com.eugene.designpatterns.state;

public class ConcreteState2 implements State {
    private static ConcreteState2 singleton = new ConcreteState2();

    private ConcreteState2() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void method1(Context context, int data) {
        if (data > 5) {
            context.changeState(ConcreteState1.getInstance());
        }
        System.out.println("ConcreteState2.method1 " + data);
    }

    @Override
    public void method2() {
        System.out.println("ConcreteState2.method2");
    }
}
