package com.eugene.design_patterns.iterator;

/**
 * 集合实体
 * @param <T>
 */
public class ConcreteAggregate<T> implements Aggregate<T> {
    private T[] arr;
    private int size = 0;

    public ConcreteAggregate(int initialCapacity) {
        arr = (T[]) new Object[initialCapacity];
    }

    public T[] getElements() {
        return arr;
    }

    public void add(T item) {
        arr[size] = item;
        size++;
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<>(this);
    }
}
