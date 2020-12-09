package com.eugene.designpatterns.chainofresponsibility;

public abstract class Handler {

    private Handler next;

    private String name;

    public Handler(String name) {
        this.name = name;
    }

    public Handler setNext(Handler next) {
        this.next = next;
        return this;
    }

    public String getName() {
        return name;
    }

    public final void request(int data) {
        if (!resolve(data)) {
            if (this.next != null) this.next.resolve(data);
            else throw new RuntimeException("no handler support");
        }
    }

    protected abstract boolean resolve(int data);

}
