package com.eugene.designpatterns.facade;

public class ClassB {
    public String makeData() {
        return getClass().getSimpleName();
    }
}
