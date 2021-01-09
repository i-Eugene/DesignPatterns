package com.eugene.designpatterns.state;

public class Context {
    private State currentState = ConcreteState1.getInstance();

    public void requestA(int data) {
        currentState.method1(this, data);
    }

    public void requestB() {
        currentState.method2();
    }

    public void changeState(State state) {
        this.currentState = state;
    }
}
