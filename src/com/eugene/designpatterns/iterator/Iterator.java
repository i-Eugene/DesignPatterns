package com.eugene.designpatterns.iterator;

/**
 * 迭代器
 * @param <T> object
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
