package com.dk.designPatterns.design_patterns_weather.jdk_util;

/**
 * @author DingKai
 * @Classname WeatherStation
 * @Description TODO
 * @create 2019/2/14
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(33,44,55);
    }
}
