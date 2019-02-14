package com.dk.designPatterns.design_patterns_weather.customize;

/**
 * @author DingKai
 * @Classname WeatherStation
 * @Description TODO
 * @create 2019/2/14
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
    }
}
