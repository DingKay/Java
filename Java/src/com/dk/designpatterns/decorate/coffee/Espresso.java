package com.dk.designpatterns.decorate.coffee;

import com.dk.designpatterns.decorate.coffee.abst.Beverage;

/**
 * @author DingKai
 * @Classname Espresso
 * @Description Drink of Espresso
 * @create 2019/2/19
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
