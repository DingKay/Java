package com.dk.designPatterns.design_patterns_coffee.decorate;

import com.dk.designPatterns.design_patterns_coffee.abst.Beverage;

/**
 * @author DingKai
 * @Classname Soy
 * @Description TODO
 * @create 2019/2/19
 */
public class Soy extends Beverage {
    Beverage beverage;

    @Override
    public double cost() {
        return beverage.cost() + .10D;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
}
