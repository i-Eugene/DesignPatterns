package com.eugene.designpatterns.mediator;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ConcreteColleague3 extends Checkbox implements Colleague, ItemListener {
    private Mediator mediator;

    public ConcreteColleague3(String caption, CheckboxGroup group, boolean state) {
        super(caption, group, state);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        this.mediator.colleagueChanged();
    }
}
