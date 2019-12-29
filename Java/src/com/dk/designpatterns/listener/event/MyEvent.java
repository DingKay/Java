package com.dk.designpatterns.listener.event;

/**
 * Passing Event Object.
 * @author DingKai
 * @version 1.0
 */
public class MyEvent {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
