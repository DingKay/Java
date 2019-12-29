package com.dk.designpatterns.observer.weather.progress.jdk;

import java.util.Observable;

/**
 * Override Observable
 * @author DingKai
 * @version 1.0
 */
public class Subject extends Observable {

    /**
     * the end of 'foreach' int 'i' value
     */
    private static final int END = 10;

    private int value;

    public int getValue() {
        return value;
    }

    private void process() {
        for (int i = 0; i < END; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.value = i;
            setChanged();
            notifyObservers();
        }
    }

    public void onStart(){
        process();
    }
}
