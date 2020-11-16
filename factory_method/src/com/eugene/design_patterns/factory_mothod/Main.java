package com.eugene.design_patterns.factory_mothod;

import com.eugene.design_patterns.factory_mothod.framework.Creator;
import com.eugene.design_patterns.factory_mothod.framework.Product;

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
