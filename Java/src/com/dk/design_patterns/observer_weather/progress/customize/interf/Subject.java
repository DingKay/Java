package com.dk.design_patterns.observer_weather.progress.customize.interf;

/**
 * @author DingKai
 * @Classname Subject
 * @Description Observer
 * @create 2019/2/15
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
