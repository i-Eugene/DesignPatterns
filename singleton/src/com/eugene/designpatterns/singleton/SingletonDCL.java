package com.eugene.designpatterns.singleton;

/**
 * 双检锁
 * 线程安全
 */
public class SingletonDCL {
    private volatile static SingletonDCL instance = null;

    private SingletonDCL() {
    }

    public SingletonDCL getInstance() {
        if (instance == null) {
            synchronized (SingletonDCL.class) {
                if (instance == null) {
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }
}
