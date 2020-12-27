package com.eugene.designpatterns.observer;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Observer observer = new ConcreteObserver();
        Observer observer1 = new ConcreteObserver1();
        Subject subject = new ConcreteSubject();
        subject.addObserver(observer);
        subject.addObserver(observer1);
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                subject.deleteObserver(observer);
            }
            subject.notifyObservers(random.nextInt(20));
        }
    }
}
