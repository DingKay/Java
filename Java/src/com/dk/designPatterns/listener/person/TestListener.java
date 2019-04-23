package com.dk.designPatterns.listener.person;

/**
 * @author DingKai
 * @Classname TestListener
 * @Description TODO
 * @create 2019/1/28
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
    public void dorun(Even even) {
        Person person = even.getPerson();
        System.out.println("prepared");
    }

    @Override
    public void doeat(Even even) {
        Person person = even.getPerson();
        System.out.println("washingHands");
    }
}
