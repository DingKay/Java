package com.dk.designPatterns.design_patterns_coffee.decorate;

import com.dk.designPatterns.design_patterns_coffee.abst.Beverage;

/**
 * @author DingKai
 * @Classname Whip
 * @Description TODO
 * @create 2019/2/19
 */
public class Whip extends Beverage {
    Beverage beverage;

    @Override
    public double cost() {
        return beverage.cost() + 0.30D;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
}
