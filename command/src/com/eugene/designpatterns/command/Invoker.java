package com.eugene.designpatterns.command;

public class Invoker {
    public void invoke(Command command) {
        command.execute();
    }
}
