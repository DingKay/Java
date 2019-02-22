package com.dk.designPatterns.observer_weather.customize.inerf;

/**
 * @author DingKai
 * @Classname Subject
 * @Description interface : Observable
 * @create 2019/2/13
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
