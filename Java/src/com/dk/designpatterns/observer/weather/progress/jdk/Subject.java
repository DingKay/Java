package com.dk.designpatterns.observer.weather.progress.jdk;

import java.util.Observable;

/**
 * @author DingKai
 * @Classname Subject
 * @Description Override Observable
 * @create 2019/2/18
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
