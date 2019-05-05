package com.dk.design_patterns.observer_weather.customize;

import com.dk.design_patterns.observer_weather.customize.inerf.DisplayElement;
import com.dk.design_patterns.observer_weather.customize.inerf.Observer;
import com.dk.design_patterns.observer_weather.customize.inerf.Subject;

/**
 * @author DingKai
 * @Classname StatisticDisplay
 * @Description ProgressObserver
 * @create 2019/2/14
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
