package com.eugene.design_patterns.singleton;

/**
 * 懒汉式
 * 线程安全
 */
public class SingletonLazySafe {
    private static SingletonLazySafe instance = null;

    private SingletonLazySafe() {
    }

    public static synchronized SingletonLazySafe getInstance() {
        if (instance == null) {
            instance = new SingletonLazySafe();
        }
        return instance;
    }
}
