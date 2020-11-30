package com.eugene.designpatterns.factorymothod;

import com.eugene.designpatterns.factorymothod.framework.Creator;
import com.eugene.designpatterns.factorymothod.framework.Product;

public class Main {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product android = creator.create("android");
        Product ios = creator.create("ios");
        Product windows = creator.create("windows");
        android.printName();
        ios.printName();
        windows.printName();
    }
}
