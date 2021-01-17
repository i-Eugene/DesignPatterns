package com.eugene.designpatterns.flyweight;

public class Flyweight {
    private final String data;
    private String from;

    public Flyweight(int len) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            builder.append(i);
        }
        data = builder.toString();
    }

    public void method1(String from) {
        this.from = from;
    }

    public void method2() {
        System.out.println(hashCode() + " " + data);
    }

}
