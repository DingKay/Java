package com.dk.design_patterns.observer_weather.jdk_util;

import com.dk.design_patterns.observer_weather.customize.inerf.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author DingKai
 * @Classname ForecastDisplay
 * @Description ProgressObserver
 * @create 2019/2/14
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float pressure;
    private Observable observable;

    public ForecastDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Pressure :" + pressure + "%, More of the same");
    }
}
