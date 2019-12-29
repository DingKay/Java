package com.dk.designpatterns.listener.person;

/**
 * @author DingKai
 * @version 1.0
 */
public class Even {
    private Person person;

    public Even(Person person){
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}
