package com.eugene.design_patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        if (singleton == singleton1) {
            System.out.println("两个实例相同");
        } else {
            System.out.println("两个实例不同");
        }
    }
}
