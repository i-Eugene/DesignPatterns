package com.eugene.designpatterns.command;

import java.util.Stack;

public class Client {
    private final Stack<Command> stack = new Stack<>();
    private final Receiver receiver = new Receiver();

    public void generateCommand(int index, int x, int y) {
        stack.add(new ConcreteCommand(receiver, x, y, index));
    }

    public Command popCommand() {
        return stack.pop();
    }
}
