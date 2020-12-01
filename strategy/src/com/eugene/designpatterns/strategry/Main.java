package com.eugene.designpatterns.strategry;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        if (args.length != 2 || !isDigit(args[0]) || !isDigit(args[1])) {
            System.out.println("请输入两个数字！");
            System.exit(0);
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        Context context = new Context(new ConcreteStrategy1());
        context.contextMethod(a, b);
        System.out.println("----------------------");
        context = new Context(new ConcreteStrategy2());
        context.contextMethod(b, a);
    }

    public static boolean isDigit(String str) {
        Pattern pattern = Pattern.compile("-?[0-9]+\\.?[0-9]*");
        Matcher isNum = pattern.matcher(str);
        return isNum.matches();
    }

}
