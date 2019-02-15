package com.dk.designPatterns.design_patterns_weather.customize.inerf;

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
