package com.eugene.designpatterns.interpreter;

public class TerminalExpression extends AbstractExpression {
    private String name;

    @Override
    public void interpreter(Context context) {
        name = context.getInfoToInterpreter();
        context.skipToken();
    }

    @Override
    public String toString() {
        return name;
    }
}
