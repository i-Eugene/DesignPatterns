package com.eugene.designpatterns.builder;

public interface Builder {
    void buildTitle(String title);

    void buildString(String string);

    String build();
}
