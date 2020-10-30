package com.eugene.designpatterns.iterator;

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
