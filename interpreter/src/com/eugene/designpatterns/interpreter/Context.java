package com.eugene.designpatterns.interpreter;

import java.util.StringTokenizer;

public class Context {
    private final StringTokenizer tokenizer;
    private String currentToken;

    public Context(String text) {
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    private String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
        return currentToken;
    }

    public void skipToken() {
        nextToken();
    }

    public String getInfoToInterpreter() {
        return currentToken;
    }
}
