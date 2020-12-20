package com.eugene.designpatterns.mediator;

import java.awt.*;

public class ConcreteColleague1 extends Button implements Colleague {

    private Mediator mediator;

    public ConcreteColleague1(String caption) {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
