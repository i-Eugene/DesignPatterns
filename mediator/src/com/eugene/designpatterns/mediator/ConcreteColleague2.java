package com.eugene.designpatterns.mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ConcreteColleague2 extends TextField implements Colleague, TextListener {
    private Mediator mediator;

    public ConcreteColleague2(String text, int columns) {
        super(text, columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void controlColleague(boolean enabled) {
        setEnabled(enabled);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        this.mediator.colleagueChanged();
    }
}
