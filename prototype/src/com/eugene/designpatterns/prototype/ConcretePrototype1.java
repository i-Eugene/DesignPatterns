package com.eugene.designpatterns.prototype;

public class ConcretePrototype1 extends BaseConcretePrototype {
    private String mDecorator;

    public ConcretePrototype1(String decorator) {
        this.mDecorator = decorator;
    }

    @Override
    public void use(String message) {
        System.out.println(this);
        for (int i = 0; i < message.length() + 2; i++) {
            System.out.print(mDecorator);
        }
        System.out.println();
        System.out.println(mDecorator + message + mDecorator);
        for (int i = 0; i < message.length() + 2; i++) {
            System.out.print(mDecorator);
        }
        System.out.println();
    }
}
