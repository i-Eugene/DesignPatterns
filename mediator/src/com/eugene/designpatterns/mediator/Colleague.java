package com.eugene.designpatterns.mediator;

public interface Colleague {
    void setMediator(Mediator mediator);

    void controlColleague(boolean enabled);
}
