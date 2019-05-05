package com.dk.design_patterns.decorate_coffee;

import com.dk.design_patterns.decorate_coffee.abst.Beverage;

/**
 * @author DingKai
 * @Classname HouseBlend
 * @Description Drink of House Blend
 * @create 2019/2/19
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89D;
    }
}