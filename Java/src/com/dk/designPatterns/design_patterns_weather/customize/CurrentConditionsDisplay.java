package com.dk.designPatterns.design_patterns_weather.customize;

import com.dk.designPatterns.design_patterns_weather.customize.inerf.DisplayElement;
import com.dk.designPatterns.design_patterns_weather.customize.inerf.Observer;
import com.dk.designPatterns.design_patterns_weather.customize.inerf.Subject;

/**
 * @author DingKai
 * @Classname CurrentConditionsDisplay
 * @Description TODO
 * @create 2019/2/14
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current Conditions :" + temperature +" F degree and " +
                humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
