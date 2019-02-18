package com.dk.designPatterns.design_patterns_weather.jdk_util;


import com.dk.designPatterns.design_patterns_weather.customize.inerf.DisplayElement;

import java.util.Observable;
import java.util.Observer;


/**
 * @author DingKai
 * @Classname GeneralDisplay
 * @Description ProgressObserver
 * @create 2019/2/14
 */
public class GeneralDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;

    public GeneralDisplay(Observable o){
        this.observable = o;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current Conditions :" + temperature +" F degree and " +
                humidity + "% humidity");
    }
}
