package com.dk.designPatterns.decorate_coffee.decorate;

import com.dk.designPatterns.decorate_coffee.abst.Beverage;
import com.dk.designPatterns.decorate_coffee.abst.CondimentDecorator;

/**
 * @author DingKai
 * @Classname Mocha
 * @Description The Condiment of Mocha
 * @create 2019/2/19
 */
public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20D;
    }
}