package com.eugene.designpatterns.visitor;

public interface Element {
    void accept(Visitor visitor, String prefix);
}
