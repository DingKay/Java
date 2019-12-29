package com.dk.designpatterns.observer.weather.jdkutil;

/**
 * Test weather screen
 * @author DingKai
 * @version 1.0
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        /*the console print order is different from customize observer
        * because the observable is a class, notifyObservers(arg) method
        * cycle reverse order, violation interface oriented programming*/
        GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(33,44,55);
    }
}
