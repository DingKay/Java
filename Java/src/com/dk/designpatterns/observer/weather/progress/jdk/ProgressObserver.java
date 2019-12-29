package com.dk.designpatterns.observer.weather.progress.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Achieve Observable
 * @author DingKai
 * @version 1.0
 */
public class ProgressObserver implements Observer {
    private int value;

    @Override
    public void update(Observable o, Object arg) {
        display();
    }

    void display(){
        System.out.print("=");
    }

    public static void main(String[] args) {
        ProgressObserver progressObserver = new ProgressObserver();
        Subject subject = new Subject();
        subject.addObserver(progressObserver);
        subject.onStart();
    }
}
