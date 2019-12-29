package com.dk.designpatterns.observer.weather.customize.inerf;

/**
 * interface : Observable
 * @author DingKai
 * @version 1.0
 */
public interface Subject {
    /**
     * register
     */
    void registerObserver(Observer o);

    /**
     * remove
     */
    void removeObserver(Observer o);

    /**
     * notify
     */
    void notifyObserver();
}
