package com.eugene.designpartterns.memento;

public class Memento {
    private int data;

    /**
     * wide interface
     *
     * @param data
     */
    public Memento(int data) {
        this.data = data;
    }

    /**
     * narrow interface
     *
     * @return data
     */
    int getData() {
        return data;
    }

    /**
     * narrow interface
     */
    void addData(int data) {
        this.data += data;
    }
}
