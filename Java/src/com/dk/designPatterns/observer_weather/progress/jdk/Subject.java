package com.dk.designPatterns.observer_weather.progress.jdk;

import java.util.Observable;

/**
 * @author DingKai
 * @Classname Subject
 * @Description TODO
 * @create 2019/2/18
 */
public class Subject extends Observable {
    private int value;

    public int getValue() {
        return value;
    }

    private void process() {
        for (int i = 0; i < 10; i++) {
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
