package com.dk.designPatterns.decorate_coffee;

import com.dk.designPatterns.decorate_coffee.abst.Beverage;

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
