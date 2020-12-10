package com.eugene.designpatterns.facade;

public class ClassC {
    private ClassC() {
    }

    public static String makeData(ClassD classD) {
        return "ClassC + " + classD.toString();
    }
}
