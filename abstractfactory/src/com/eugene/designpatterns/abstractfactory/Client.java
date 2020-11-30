package com.eugene.designpatterns.abstractfactory;

import com.eugene.designpatterns.abstractfactory.factory.*;

public class Client {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory(Factory.FACTORY_1);
        Product p1 = factory.createProduct1();
        Product p2 = factory.createProduct2();
        Product p3 = factory.createProduct3();

        p1.printName();
        if (canTest(p1)) {
            ((Test) p1).test();
        } else {
            System.out.println("没有测试");
        }
        p2.printName();
        if (canTest(p2)) {
            ((Test) p2).test();
        } else {
            System.out.println("没有测试");
        }
        p3.printName();
        if (canTest(p3)) {
            ((Test) p3).test();
        } else {
            System.out.println("没有测试");
        }
    }

    static boolean canTest(Product product) {
        return product instanceof Test;
    }
}
