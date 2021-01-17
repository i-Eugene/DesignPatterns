package com.eugene.designpatterns.flyweight;

public class Client {
    private Flyweight[] flyweights;

    public Client(String str) {
        flyweights = new Flyweight[str.length()];
        for (int i = 0; i < str.length(); i++) {
            flyweights[i] = FlyweightFactory.getFlyweight(String.valueOf(str.charAt(i)));
        }
    }

    public void print() {
        for (Flyweight flyweight : flyweights) {
            flyweight.method2();
        }
    }

    public static void main(String[] args) {
        Client client = new Client("1213");
        client.print();
    }
}
