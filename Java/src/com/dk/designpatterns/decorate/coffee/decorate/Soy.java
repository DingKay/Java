package com.dk.designpatterns.decorate.coffee.decorate;

import com.dk.designpatterns.decorate.coffee.abst.Beverage;
import com.dk.designpatterns.decorate.coffee.abst.CondimentDecorator;

/**
 * The Condiment of Soy milk
 * @author DingKai
 */
public class Soy extends CondimentDecorator {
    @Override
    public double cost() {
        double cost = beverage.cost();
        /*JDK support switch statement use enumerate*/
        switch (beverage.getSize()){
            case TALL: cost += .10D;
            break;
            case GRANDE: cost += .15D;
            break;
            case VENTI: cost += .20D;
            break;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + beverage.size + " Soy";
    }

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
}
