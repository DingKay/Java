package com.dk.design_patterns.decorate_coffee;

import com.dk.design_patterns.decorate_coffee.abst.Beverage;

/**
 * @author DingKai
 * @Classname BlackCoffee
 * @Description Drink of blackCoffee
 * @create 2019/2/22
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
