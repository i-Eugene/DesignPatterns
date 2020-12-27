package com.eugene.designpatterns.observer;

public class ConcreteObserver implements Observer {

    @Override
    public void update(int data) {
        System.out.println("Observer " + data);
    }
}
