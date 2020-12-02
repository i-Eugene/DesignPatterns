package com.eugene.designpatterns.composite;

public abstract class BaseComponent implements Component {

    protected String name;

    public BaseComponent(String name) {
        this.name = name;
    }

    public void printList(String prefix) throws RuntimeException {
        throw new RuntimeException("Leaf do not have children");
    }

    public void remove(Component component) throws RuntimeException {
        throw new RuntimeException("Leaf can not add child");
    }

    public void add(Component component) throws RuntimeException {
        throw new RuntimeException("Leaf can not add child");
    }

    @Override
    public String getName() {
        return name;
    }
}
