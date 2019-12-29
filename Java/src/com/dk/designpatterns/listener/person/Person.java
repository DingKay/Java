package com.dk.designpatterns.listener.person;

/**
 * @author DingKai
 * @version 1.0
 */
public class Person {
    private PersonListener listener;

    public void registerListener(PersonListener listener) {
        this.listener = listener;
    }

    public void eat(){
        if (listener != null) {
            Even even = new Even(this);
            this.listener.doEat(even);
        }
        System.out.println("Eating");
    }

    public void run(){
        if (listener != null) {
            Even even = new Even(this);
            this.listener.doRun(even);
        }
        System.out.println("Running");
    }
}
