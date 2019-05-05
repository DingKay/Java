package com.dk.design_patterns.observer_weather.customize.inerf;

/**
 * @author DingKai
 * @Classname ProgressObserver
 * @Description interface : ProgressObserver
 * @create 2019/2/13
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}