package com.eugene.designpatterns.prototype;

public abstract class BaseConcretePrototype implements Prototype{

    public Prototype createClone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
