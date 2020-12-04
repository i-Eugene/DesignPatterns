package com.eugene.designpatterns.builder;

public class ConcreteBuilder1 implements Builder {

    StringBuilder builder = new StringBuilder();

    @Override
    public Builder buildTitle(String title) {
        builder.append("<head>").append("<title>").append(title);
        builder.append("<\\title>").append("<\\head>").append("\n").append("<body>").append("\n");
        return this;
    }

    @Override
    public Builder buildString(String string) {
        builder.append(string).append("\n");
        return this;
    }

    @Override
    public String build() {
        return builder.append("<\\body>").toString();
    }
}
