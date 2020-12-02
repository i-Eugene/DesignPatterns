package com.eugene.designpatterns.composite;

public class Client {
    public static void main(String[] args) {
        Composite composite = new Composite("Eugene Root");
        composite.add(new Composite("Eugene 1"));
        Composite c1 = new Composite("Eugene 2");
        Composite c2 = new Composite("Eugene 6");
        c2.add(new Leaf("Eugene 9"));
        c1.add(c2);
        c1.add(new Composite("Eugene 7"));
        c1.add(new Leaf("Eugene 8"));
        composite.add(c1);
        composite.add(new Leaf("Eugene 3"));
        composite.add(new Leaf("Eugene 4"));
        composite.add(new Composite("Eugene 5"));

        composite.printList("-");
    }
}
