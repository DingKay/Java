package com.dk.design_patterns.observer_weather.progress.customize.interf_impl;

import com.dk.design_patterns.observer_weather.progress.customize.interf.Observer;
import com.dk.design_patterns.observer_weather.progress.customize.interf.Subject;

import java.util.ArrayList;

/**
 * @author DingKai
 * @Classname Observable
 * @Description Observable
 * @create 2019/2/15
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
