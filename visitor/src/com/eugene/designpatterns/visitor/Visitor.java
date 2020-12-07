package com.eugene.designpatterns.visitor;

public interface Visitor {
    void visit(ConcreteElementA elementA, String prefix);

    void visit(ConcreteElementB elementB, String prefix);
}
