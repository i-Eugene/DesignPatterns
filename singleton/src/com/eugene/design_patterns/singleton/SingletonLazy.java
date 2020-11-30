package com.eugene.design_patterns.singleton;

/**
 * 懒汉式
 * 非线程安全
 */
public class SingletonLazy {
    private static SingletonLazy instance = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
