package com.dk.designpatterns.observer.weather.customize.inerf;

/**
 * interface : ProgressObserver
 * @author DingKai
 * @version 1.0
 */
public interface Observer {
    /**
     * ProgressObserver
     */
    void update(float temp, float humidity, float pressure);
}
