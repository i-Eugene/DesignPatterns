package com.eugene.design_patterns.iterator;

/**
 * 集合
 */
public interface Aggregate<T> {
    Iterator<T> iterator();
}
