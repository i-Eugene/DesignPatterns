package com.eugene.designpatterns.interpreter;

import java.util.ArrayList;

public class NonTerminalExpression extends AbstractExpression {
    private ArrayList<AbstractExpression> list = new ArrayList<>();

    @Override
    public void interpreter(Context context) {
        while (true) {
            String name = context.getInfoToInterpreter();
            if (name == null || name.equals("end")) {
                break;
            } else {
                AbstractExpression expression = new TerminalExpression();
                expression.interpreter(context);
                list.add(expression);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
