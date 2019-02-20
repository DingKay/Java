package com.dk.designPatterns.design_patterns_coffee.test;

import com.dk.designPatterns.design_patterns_coffee.Espresso;
import com.dk.designPatterns.design_patterns_coffee.HouseBlend;
import com.dk.designPatterns.design_patterns_coffee.abst.Beverage;
import com.dk.designPatterns.design_patterns_coffee.decorate.Mocha;
import com.dk.designPatterns.design_patterns_coffee.decorate.Whip;

/**
 * @author DingKai
 * @Classname StarBuzzCoffee
 * @Description TODO
 * @create 2019/2/19
 */
public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
