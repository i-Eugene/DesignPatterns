package com.eugene.design_patterns.singleton;

public class Main {
    public static void main(String[] args) {

        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum1 = SingletonEnum.valueOf("INSTANCE");
        if (singletonEnum == singletonEnum1) {
            System.out.println("两个枚举相同");
        } else {
            System.out.println("两个枚举不同");
        }
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        if (singleton == singleton1) {
            System.out.println("两个实例相同");
        } else {
            System.out.println("两个实例不同");
        }
    }
}
