package com.eugene.designpatterns.interpreter;

/**
 *
 */
public class Client {
    public static void main(String[] args) {

        String text = "go right go right go left end go left";

        AbstractExpression expression = new NonTerminalExpression();
        expression.interpreter(new Context(text));
        System.out.println("expression = " + expression);
    }
}
