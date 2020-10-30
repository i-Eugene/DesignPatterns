package com.eugene.designpatterns.iterator;

/**
 * 集合
 */
public interface Aggregate<T> {
    Iterator<T> iterator();
}
