package com.eugene.design_patterns.iterator;

/**
 * 集合迭代器
 * @param <T>
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private final ConcreteAggregate<T> concreteAggregate;
    private int index = 0;

    public ConcreteIterator(ConcreteAggregate<T> concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public boolean hasNext() {
        return index < concreteAggregate.getElements().length;
    }

    @Override
    public T next() {
        if (index >= concreteAggregate.getElements().length) {
            throw new IndexOutOfBoundsException(
                    "index is "
                            + index
                            + " but size is "
                            + concreteAggregate.getElements().length
            );
        }
        T t = concreteAggregate.getElements()[index];
        index++;
        return t;
    }
}
