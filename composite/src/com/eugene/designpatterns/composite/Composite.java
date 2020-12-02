package com.eugene.designpatterns.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Composite extends BaseComponent {

    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + getName() + "'s children");
        Iterator<Component> iterator = components.iterator();
        while (iterator.hasNext()) {
            Component component = iterator.next();
            if (component.isComposite()) {
                component.printList(prefix + "---");
            } else {
                System.out.println(prefix + "---" + component.getName());
            }
        }
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public String getName() {
        return "Composite: " + super.getName();
    }

    @Override
    public boolean isComposite() {
        return true;
    }
}
