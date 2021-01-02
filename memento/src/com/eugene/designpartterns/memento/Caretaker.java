package com.eugene.designpartterns.memento;

public class Caretaker {
    public static void main(String[] args) {
        Originator originator = new Originator(10);
        Memento memento = originator.createMemento();
        for (int i = 0; i < 20; i++) {
            int data = originator.getData();
            if (data == 3) {
                originator.restoreMemento(memento);
                System.out.println("数据已恢复");
            } else {
                originator.updateData();
            }
        }
        System.out.println("程序结束，最后数据为：" + originator.getData());
    }
}
