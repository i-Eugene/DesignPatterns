package com.eugene.designpatterns.builder;

public class ConcreteBuilder2 implements Builder {
    StringBuilder builder = new StringBuilder();

    @Override
    public Builder buildTitle(String title) {
        builder.append("===========================");
        builder.append("\n");
        builder.append("《").append(title).append("》");
        builder.append("\n");
        return this;
    }

    @Override
    public Builder buildString(String string) {
        builder.append("~").append(string);
        builder.append("\n");
        return this;
    }

    @Override
    public String build() {
        return builder.append("===========================").toString();
    }
}
