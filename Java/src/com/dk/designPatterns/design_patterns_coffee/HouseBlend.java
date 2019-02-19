package com.dk.designPatterns.design_patterns_coffee;

import com.dk.designPatterns.design_patterns_coffee.abst.Beverage;

/**
 * @author DingKai
 * @Classname HouseBlend
 * @Description TODO
 * @create 2019/2/19
 */
public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89D;
    }
}
