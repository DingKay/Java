package com.dk.designpatterns.decorate.coffee.decorate;

import com.dk.designpatterns.decorate.coffee.abst.Beverage;
import com.dk.designpatterns.decorate.coffee.abst.CondimentDecorator;

/**
 * milk foam.. of whip
 * @author DingKai
 * @version 1.0
 */
public class Whip extends CondimentDecorator {
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
