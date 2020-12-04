package com.eugene.designpatterns.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static boolean isDigit(String str) {
        Pattern pattern = Pattern.compile("-?[0-9]+\\.?[0-9]*");
        Matcher isNum = pattern.matcher(str);
        return isNum.matches();
    }
}
