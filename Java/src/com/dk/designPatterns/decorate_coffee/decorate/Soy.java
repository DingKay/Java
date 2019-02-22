package com.dk.designPatterns.decorate_coffee.decorate;

import com.dk.designPatterns.decorate_coffee.abst.Beverage;
import com.dk.designPatterns.decorate_coffee.abst.CondimentDecorator;

/**
 * @author DingKai
 * @Classname Soy
 * @Description TODO
 * @create 2019/2/19
 */
public class Soy extends CondimentDecorator {
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
