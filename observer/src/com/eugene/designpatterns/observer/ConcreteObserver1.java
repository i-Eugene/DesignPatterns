package com.eugene.designpatterns.observer;

public class ConcreteObserver1 implements Observer {
    @Override
    public void update(int data) {
        System.out.print("Observer# ");
        for (int i = 0; i < data; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
