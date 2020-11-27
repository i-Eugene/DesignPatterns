package com.eugene.design_patterns.prototype;

public class ConcretePrototype2 implements Prototype {

    private String mDecorator;

    public ConcretePrototype2(String decorator) {
        this.mDecorator = decorator;
    }

    @Override
    public Prototype createClone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prototype;
    }

    @Override
    public void use(String message) {
        System.out.println(this);
        System.out.println(message);
        for (int i = 0; i < message.length(); i++) {
            System.out.print(mDecorator);
        }
    }
}
