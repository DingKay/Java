package com.dk.designpatterns.observer.weather.progress.customize.interf;

/**
 * @author DingKai
 * @Classname Subject
 * @Description Observer
 * @create 2019/2/15
 */
public interface Subject {
    /**
     * observer design pattern registry method
     * @author DingKai
     * @date 2019/5/27
     * @param observer
     * @return void
     */
    void registerObserver(Observer observer);

    /**
     * remove Observer
     * @author DingKai
     * @date 2019/5/27
     * @param observer
     * @return void
     */
    void removeObserver(Observer observer);

    /**
     * notify Observers
     */
    void notifyObservers();
}
