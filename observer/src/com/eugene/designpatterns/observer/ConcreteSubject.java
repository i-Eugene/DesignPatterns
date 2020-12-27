package com.eugene.designpatterns.observer;

public class ConcreteSubject extends Subject {

    int status;

    public void updateStatus(int status) {
        this.status = status;
        notifyObservers(status);
    }

    @Override
    public int getSubjectStatus() {
        return status;
    }
}
