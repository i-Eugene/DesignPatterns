package com.eugene.designpatterns.builder;

public interface Builder {
    Builder buildTitle(String title);

    Builder buildString(String string);

    String build();
}
