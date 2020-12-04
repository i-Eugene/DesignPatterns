package com.eugene.designpatterns.builder;

import com.eugene.designpatterns.utils.Utils;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("请输入0或1：");
            byte[] bytes = new byte[64];
            System.in.read(bytes);
            String argString = new String(bytes).trim();
            if (Utils.isDigit(argString)) {
                int arg = Integer.parseInt(argString);
                Builder builder = null;
                if (arg == 0) {
                    builder = new ConcreteBuilder1();
                } else if (arg == 1) {
                    builder = new ConcreteBuilder2();
                } else {
                    System.out.println("未识别指令，请尝试输入0或1");
                }
                if (builder != null) {
                    System.out.println(new Director(builder).construct());
                }
            } else {
                System.out.println("未识别指令，请尝试输入0或1");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
