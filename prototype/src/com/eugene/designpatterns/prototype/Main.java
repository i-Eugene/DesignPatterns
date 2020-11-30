package com.eugene.designpatterns.prototype;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.register("one", new ConcretePrototype1("#"));
        manager.register("two", new ConcretePrototype2("+"));
        Prototype p1 = manager.create("one");
        p1.use("Hello Prototype");
        Prototype p2 = manager.create("two");
        p2.use("Hello Prototype");
    }
}
