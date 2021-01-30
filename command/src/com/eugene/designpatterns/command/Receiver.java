package com.eugene.designpatterns.command;

public class Receiver {
    public void action(int x, int y, int index) {
        System.out.println("Receiver.action x=" + x + " y=" + y + " index=" + index);
    }
}
