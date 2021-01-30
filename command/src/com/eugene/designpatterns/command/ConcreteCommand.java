package com.eugene.designpatterns.command;

public class ConcreteCommand implements Command {
    private int x, y, index;
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver, int x, int y, int index) {
        this.x = x;
        this.y = y;
        this.index = index;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action(x, y, index);
    }
}
