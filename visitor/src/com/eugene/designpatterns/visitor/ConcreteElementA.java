package com.eugene.designpatterns.visitor;

import com.eugene.designpatterns.composite.Leaf;

/**
 * 偷个懒，直接复用 Composite 模式部分代码
 */
public class ConcreteElementA extends Leaf implements Element {

    public ConcreteElementA(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor, String prefix) {
        visitor.visit(this, prefix);
    }
}
