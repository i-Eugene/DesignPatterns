package com.eugene.designpatterns.mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConcreteMediator extends Frame implements ActionListener, Mediator {
    private ConcreteColleague3 checkGuest;
    private ConcreteColleague3 checkLogin;

    private ConcreteColleague2 textUser;
    private ConcreteColleague2 textPass;

    private ConcreteColleague1 buttonOK;
    private ConcreteColleague1 buttonCancel;

    public ConcreteMediator(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4, 3));
        createColleagues();

        add(checkGuest);
        add(checkLogin);
        add(new Label("Username: "));
        add(textUser);
        add(new Label("Password: "));
        add(textPass);
        add(buttonOK);
        add(buttonCancel);

        colleagueChanged();

        pack();
        show();
    }

    @Override
    public void createColleagues() {
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ConcreteColleague3("Guest", g, true);
        checkLogin = new ConcreteColleague3("Login", g, false);

        textUser = new ConcreteColleague2("", 10);
        textPass = new ConcreteColleague2("", 10);
        textPass.setEchoChar('*');

        buttonCancel = new ConcreteColleague1("Cancel");
        buttonOK = new ConcreteColleague1("OK");

        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonCancel.setMediator(this);
        buttonOK.setMediator(this);

        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonCancel.addActionListener(this);
        buttonOK.addActionListener(this);
    }

    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) {
            textUser.controlColleague(false);
            textPass.controlColleague(false);
            buttonOK.controlColleague(true);
        } else {
            textUser.controlColleague(true);
            userpassChanged();
        }
    }

    private void userpassChanged() {
        if (textUser.getText().length() > 0) {
            textPass.controlColleague(true);
            if (textPass.getText().length() > 0) {
                buttonOK.controlColleague(true);
            } else {
                buttonOK.controlColleague(false);
            }
        } else {
            textPass.controlColleague(false);
            buttonOK.controlColleague(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
