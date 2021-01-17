package com.eugene.designpatterns.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private static final HashMap<String, Flyweight> pool = new HashMap<>();

    public static Flyweight getFlyweight(String key) {
        Flyweight flyweight = pool.get(key);
        if (flyweight == null) {
            flyweight = new Flyweight(Integer.parseInt(key));
            pool.put(key, flyweight);
        }
        return flyweight;
    }
}
