package com.dk.designpatterns.decorate.coffee;

import com.dk.designpatterns.decorate.coffee.abst.Beverage;

/**
 * Drink of blackCoffee
 * @author DingKai
 * @version 1.0
 */
public class BlackCoffee extends Beverage {
    public BlackCoffee(){
        this.description = "Black Coffee";
    }

    @Override
    public double cost() {
        return 0.75D;
    }
}
