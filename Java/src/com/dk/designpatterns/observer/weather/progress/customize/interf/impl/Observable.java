package com.dk.designpatterns.observer.weather.progress.customize.interf.impl;

import com.dk.designpatterns.observer.weather.progress.customize.interf.Observer;
import com.dk.designpatterns.observer.weather.progress.customize.interf.Subject;

import java.util.ArrayList;

/**
 * Observable
 * @author DingKai
 * @version 1.0
 */
public class Observable implements Subject {
    private ArrayList observers;

    public Observable (){
        this.observers = new ArrayList();
    }
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0){
            this.observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer o = (Observer) observers.get(i);
            o.update();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void setChangeValue(){
        notifyObservers();
    }
}
