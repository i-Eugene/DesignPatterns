package com.eugene.designpartterns.memento;

public class Originator {
    private int data;

    public Originator(int data) {
        this.data = data;
    }

    public Memento createMemento() {
        return new Memento(this.data);
    }

    public void restoreMemento(Memento memento) {
        this.data = memento.getData();
    }

    public void updateData() {
        this.data -= 1;
    }

    public int getData() {
        return data;
    }
}
