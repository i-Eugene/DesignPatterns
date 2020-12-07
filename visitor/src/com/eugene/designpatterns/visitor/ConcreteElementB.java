package com.eugene.designpatterns.visitor;

import com.eugene.designpatterns.composite.Component;
import com.eugene.designpatterns.composite.Composite;


/**
 * 偷个懒，直接复用 Composite 模式部分代码
 * <p>
 * 剧情需要 ConcreteElementB 同时扮演两个角色，即是Element也是ObjectStructure
 */
public class ConcreteElementB extends Composite implements Element {

    public ConcreteElementB(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor, String prefix) {
        visitor.visit(this, prefix);
    }

    public Iterator iterator() {
        return new Iterator(this);
    }

    public static class Iterator {
        private final java.util.Iterator<Component> iterator;

        public Iterator(ConcreteElementB elementB) {
            this.iterator = elementB.components.iterator();
        }

        public Element next() {
            return (Element) iterator.next();
        }

        public boolean hasNext() {
            return iterator.hasNext();
        }

    }
}
