package com.eugene.designpatterns.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public String construct() {
        builder.buildTitle("I am Title");
        builder.buildString("I am Content1").buildString("I am Content2");
        return builder.build();
    }
}
