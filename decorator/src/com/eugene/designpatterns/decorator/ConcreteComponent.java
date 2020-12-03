package com.eugene.designpatterns.decorator;

public class ConcreteComponent implements Component {
    private String text;

    public ConcreteComponent(String text) {
        this.text = text;
    }

    @Override
    public int getLength() {
        return text.length();
    }

    @Override
    public String getRowText(int i) {
        return this.text;
    }

    @Override
    public int getRowCount() {
        return 1;
    }
}
