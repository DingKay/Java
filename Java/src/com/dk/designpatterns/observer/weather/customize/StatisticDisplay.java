package com.dk.designpatterns.observer.weather.customize;

import com.dk.designpatterns.observer.weather.customize.inerf.DisplayElement;
import com.dk.designpatterns.observer.weather.customize.inerf.Observer;
import com.dk.designpatterns.observer.weather.customize.inerf.Subject;

/**
 * ProgressObserver
 * @author DingKai
 * @version 1.0
 */
public class StatisticDisplay implements DisplayElement, Observer {
    private float temp;
    private Subject weatherData;

    public StatisticDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        display();
    }

    @Override
    public void display() {
        System.out.println("Temperature :" + temp + "C");
    }
}
