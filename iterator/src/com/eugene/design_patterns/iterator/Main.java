package com.eugene.design_patterns.iterator;

public class Main {
    public static void main(String[] args) {
        ConcreteAggregate<String> aggregate = new ConcreteAggregate<>(5);
        aggregate.add("A");
        aggregate.add("B");
        aggregate.add("C");
        aggregate.add("D");
        aggregate.add("E");
        Iterator<String> iterator = aggregate.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
