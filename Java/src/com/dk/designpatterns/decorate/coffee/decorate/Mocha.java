package com.dk.designpatterns.decorate.coffee.decorate;

import com.dk.designpatterns.decorate.coffee.abst.Beverage;
import com.dk.designpatterns.decorate.coffee.abst.CondimentDecorator;

/**
 * The Condiment of Mocha
 * @author DingKai
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
