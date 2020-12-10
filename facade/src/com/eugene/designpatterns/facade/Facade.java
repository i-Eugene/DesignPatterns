package com.eugene.designpatterns.facade;

/**
 * 模拟Facade
 * 模拟复杂的角色、算法，输出相应的数据。
 */
public class Facade {

    private Facade() {
    }

    public static String makeContent(String scheme) {
        ClassA dataA = new ClassA();
        ClassB dataB = new ClassB();
        String dataC = ClassC.makeData(new ClassD());
        StringBuilder builder = new StringBuilder(scheme);
        builder.append("\n");
        builder.append("<<<<<");
        builder.append("\n");
        builder.append(dataA.makeData());
        builder.append("\n");
        builder.append(dataB.makeData());
        builder.append("\n");
        builder.append(dataC);
        builder.append("\n");
        builder.append(">>>>>");
        return builder.toString();
    }
}
