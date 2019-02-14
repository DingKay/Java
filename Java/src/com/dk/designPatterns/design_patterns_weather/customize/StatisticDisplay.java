package com.dk.designPatterns.design_patterns_weather.customize;

import com.dk.designPatterns.design_patterns_weather.customize.inerf.DisplayElement;
import com.dk.designPatterns.design_patterns_weather.customize.inerf.Observer;
import com.dk.designPatterns.design_patterns_weather.customize.inerf.Subject;

/**
 * @author DingKai
 * @Classname StatisticDisplay
 * @Description TODO
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
