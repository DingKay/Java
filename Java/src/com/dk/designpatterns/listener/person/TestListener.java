package com.dk.designpatterns.listener.person;

/**
 * @author DingKai
 * @version 1.0
 */
public class TestListener {
    public static void main(String[] args) {
        Person person = new Person();
        person.registerListener(new PersonListenerImpl());
        person.run();
        person.eat();
    }
}

class PersonListenerImpl implements PersonListener{
    @Override
    public void doRun(Even even) {
        Person person = even.getPerson();
        System.out.println("prepared");
    }

    @Override
    public void doEat(Even even) {
        Person person = even.getPerson();
        System.out.println("washingHands");
    }
}
