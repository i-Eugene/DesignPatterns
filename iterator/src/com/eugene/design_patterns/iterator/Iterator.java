package com.eugene.design_patterns.iterator;

/**
 * 迭代器
 * @param <T> object
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
