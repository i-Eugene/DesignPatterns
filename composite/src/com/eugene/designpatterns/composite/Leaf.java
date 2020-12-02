package com.eugene.designpatterns.composite;

public class Leaf extends BaseComponent {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Leaf: " + super.getName();
    }

    @Override
    public boolean isComposite() {
        return false;
    }
}
