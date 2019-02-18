package com.dk.designPatterns.design_patterns_weather.progress.customize.interf;

/**
 * @author DingKai
 * @Classname Subject
 * @Description TODO
 * @create 2019/2/15
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
