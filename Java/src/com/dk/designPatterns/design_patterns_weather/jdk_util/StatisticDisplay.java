package com.dk.designPatterns.design_patterns_weather.jdk_util;

import com.dk.designPatterns.design_patterns_weather.customize.inerf.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author DingKai
 * @Classname StatisticDisplay
 * @Description Observer
 * @create 2019/2/14
 */
public class StatisticDisplay implements DisplayElement, Observer {
    private float temperature;
    private Observable observable;

    public StatisticDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Temperature :" + temperature + "C");
    }
}