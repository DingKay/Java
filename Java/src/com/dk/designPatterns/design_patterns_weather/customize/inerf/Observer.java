package com.dk.designPatterns.design_patterns_weather.customize.inerf;

/**
 * @author DingKai
 * @Classname Observer
 * @Description interface : Observer
 * @create 2019/2/13
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
