package com.eugene.designpatterns.composite;

public interface Component {

    void printList(String prefix);

    String getName();

    void remove(Component component);

    void add(Component component);

    boolean isComposite();
}
