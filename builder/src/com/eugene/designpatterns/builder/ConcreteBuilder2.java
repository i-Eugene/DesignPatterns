package com.eugene.designpatterns.builder;

public class ConcreteBuilder2 implements Builder {
    StringBuilder builder = new StringBuilder();

    @Override
    public void buildTitle(String title) {
        builder.append("===========================");
        builder.append("\n");
        builder.append("《").append(title).append("》");
        builder.append("\n");
    }

    @Override
    public void buildString(String string) {
        builder.append("~").append(string);
        builder.append("\n");
    }

    @Override
    public String build() {
        return builder.append("===========================").toString();
    }
}
