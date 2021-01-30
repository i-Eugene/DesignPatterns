package com.eugene.designpatterns.command;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Invoker invoker = new Invoker();

        Random random = new Random();
        System.out.println("-----先生成十条命令-----");
        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            client.generateCommand(i, x, y);
            System.out.println("Main x=" + x + " y=" + y + " index=" + i);
        }
        System.out.println("-----十条命令生成完毕，开始运行-----");
        for (int i = 0; i < 10; i++) {
            invoker.invoke(client.popCommand());
        }

    }
}
