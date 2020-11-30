package com.eugene.design_patterns.singleton;

/**
 * 枚举类型
 * 线程安全、序列化安全
 */
public enum SingletonEnum {
    INSTANCE;

    public void print(String str) {
        System.out.println(name());
    }


}
