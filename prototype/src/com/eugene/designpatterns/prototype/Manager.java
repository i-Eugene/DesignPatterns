package com.eugene.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, Prototype> cache = new HashMap();

    public void register(String key, Prototype prototype) {
        cache.put(key, prototype);
    }

    public Prototype create(String key) {
        Prototype prototype = cache.get(key);
        prototype.createClone();
        return prototype;
    }
}
