package com.dk.designpatterns.observer.weather.customize;

import com.dk.designpatterns.observer.weather.customize.inerf.DisplayElement;
import com.dk.designpatterns.observer.weather.customize.inerf.Observer;
import com.dk.designpatterns.observer.weather.customize.inerf.Subject;

/**
 * ProgressObserver
 * @author DingKai
 * @version 1.0
 */
public class ForecastDisplay implements DisplayElement, Observer {
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Pressure :" + pressure + "%, More of the same");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }
}
