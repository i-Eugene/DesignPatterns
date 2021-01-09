package com.eugene.designpatterns.state;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            context.requestA(random.nextInt(10));
            if (i % 2 == 0) {
                System.out.println("------------------------------------------");
                context.requestB();
                System.out.println("------------------------------------------");
            }
        }
    }
}
