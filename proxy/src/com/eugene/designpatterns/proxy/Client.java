package com.eugene.designpatterns.proxy;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.method1();
    }
}
