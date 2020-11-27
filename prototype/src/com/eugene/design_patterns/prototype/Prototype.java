package com.eugene.design_patterns.prototype;

public interface Prototype extends Cloneable {

    Prototype createClone();

    void use(String message);
}
