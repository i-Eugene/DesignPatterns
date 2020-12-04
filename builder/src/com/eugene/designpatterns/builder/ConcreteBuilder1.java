package com.eugene.designpatterns.builder;

public class ConcreteBuilder1 implements Builder {

    StringBuilder builder = new StringBuilder();

    @Override
    public void buildTitle(String title) {
        builder.append("<head>").append("<title>").append(title);
        builder.append("<\\title>").append("<\\head>").append("\n").append("<body>").append("\n");
    }

    @Override
    public void buildString(String string) {
        builder.append(string).append("\n");
    }

    @Override
    public String build() {
        return builder.append("<\\body>").toString();
    }
}
