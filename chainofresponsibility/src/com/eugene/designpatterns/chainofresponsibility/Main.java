package com.eugene.designpatterns.chainofresponsibility;

/**
 * 定义了处理基数和偶数的两个处理者，
 * 分别打印相关处理者的名称和被处理的数字
 */
public class Main {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1("Eugene");
        Handler handler2 = new ConcreteHandler2("尤金");
        handler1.setNext(handler2);
        for (int i = 0; i < 20; i++) {
            handler1.request(i);
        }
    }
}
