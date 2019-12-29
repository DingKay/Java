package com.dk.designpatterns.observer.weather.progress.customize.interf;

/**
 * Observer
 * @author DingKai
 * @version 1.0
 */
public interface Subject {
    /**
     * observer design pattern registry method
     * @author DingKai
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * remove Observer
     * @author DingKai
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * notify Observers
     */
    void notifyObservers();
}
