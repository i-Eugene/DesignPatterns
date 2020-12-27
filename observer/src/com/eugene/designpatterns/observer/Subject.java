package com.eugene.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(int data) {
        for (Observer observer : observers) {
            observer.update(data);
        }
    }

    public abstract int getSubjectStatus();
}
