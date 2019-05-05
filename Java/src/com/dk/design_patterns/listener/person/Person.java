package com.dk.design_patterns.listener.person;

/**
 * @author DingKai
 * @Classname Person
 * @Description TODO
 * @create 2019/1/28
 */
public class Person {
    private PersonListener listener;

    public void registerListener(PersonListener listener) {
        this.listener = listener;
    }

    public void eat(){
        if (listener != null) {
            Even even = new Even(this);
            this.listener.doeat(even);
        }
        System.out.println("Eating");
    }

    public void run(){
        if (listener != null) {
            Even even = new Even(this);
            this.listener.dorun(even);
        }
        System.out.println("Running");
    }
}
