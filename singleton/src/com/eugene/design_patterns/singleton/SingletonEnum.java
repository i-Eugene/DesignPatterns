package com.eugene.design_patterns.singleton;

public enum SingletonEnum {
    INSTANCE;

    public void print(String str) {
        System.out.println(name());;
    }


}
