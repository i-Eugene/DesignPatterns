package com.eugene.designpatterns.prototype;

public interface Prototype extends Cloneable {

    Prototype createClone();

    void use(String message);
}
