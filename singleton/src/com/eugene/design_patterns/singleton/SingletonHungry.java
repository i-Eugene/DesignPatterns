package com.eugene.design_patterns.singleton;

/**
 * 饿汉式
 * 线程安全
 * 类加载时被初始化
 */
public class SingletonHungry {

    private static SingletonHungry singletonHungry = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return singletonHungry;
    }
}
