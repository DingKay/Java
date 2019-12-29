package com.dk.designpatterns.decorate.coffee;

import com.dk.designpatterns.decorate.coffee.abst.Beverage;

/**
 * Drink of Espresso
 * @author DingKai
 * @version 1.0
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99D;
    }
}
