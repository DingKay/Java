package com.dk.design_patterns.listener.event;

/**
 * @author DingKai
 * @Classname MyEvent
 * @Description Passing Event Object.
 * @create 2019/1/30
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
