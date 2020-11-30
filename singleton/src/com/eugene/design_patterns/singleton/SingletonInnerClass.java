package com.eugene.design_patterns.singleton;

/**
 * 登记式/静态内部类式
 * 线程安全
 */
public class SingletonInnerClass {

    private SingletonInnerClass() {
        System.out.println("生成了一个实例");
    }

    public static SingletonInnerClass getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }
}
