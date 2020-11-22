package com.eugene.design_patterns.singleton;

public class Singleton {

    private Singleton() {
        System.out.println("生成了一个实例");
    }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        static final Singleton INSTANCE = new Singleton();
    }
}
