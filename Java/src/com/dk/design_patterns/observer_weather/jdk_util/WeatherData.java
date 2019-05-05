package com.dk.design_patterns.observer_weather.jdk_util;

import java.util.Observable;

/**
 * @author DingKai
 * @Classname WeatherData
 * @Description Observable :registerObserver, removeObserver, notifyObserver is achieve from supertype
 * @create 2019/2/14
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
