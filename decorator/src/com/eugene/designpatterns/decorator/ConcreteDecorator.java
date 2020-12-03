package com.eugene.designpatterns.decorator;

public class ConcreteDecorator extends Decorator {

    private final char decorator;

    public ConcreteDecorator(Component component, char decorator) {
        super(component);
        this.decorator = decorator;
    }

    @Override
    public int getLength() {
        return 1 + component.getLength() + 1;
    }

    @Override
    public String getRowText(int index) {
        if (index == 0) {
            return createLine(getLength());
        } else if (index == getRowCount() - 1) {
            return createLine(getLength());
        } else {
            return decorator + component.getRowText(index - 1) + decorator;
        }
    }

    @Override
    public int getRowCount() {
        return 1 + component.getRowCount() + 1;
    }

    private String createLine(int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(decorator);
        }
        return builder.toString();
    }
}
