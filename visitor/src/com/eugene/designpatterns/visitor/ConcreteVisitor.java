package com.eugene.designpatterns.visitor;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(ConcreteElementA elementA, String prefix) {
        System.out.println(prefix + elementA.getName());
    }

    @Override
    public void visit(ConcreteElementB elementB, String prefix) {
        System.out.println(prefix + elementB.getName());
        ConcreteElementB.Iterator iterator = elementB.iterator();
        while (iterator.hasNext()) {
            Element element = iterator.next();
            element.accept(this, prefix + "---");
        }
    }
}
