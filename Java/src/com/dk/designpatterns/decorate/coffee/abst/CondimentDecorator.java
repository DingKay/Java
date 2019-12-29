package com.dk.designpatterns.decorate.coffee.abst;

/**
 * The abstract class Condiment
 * @author DingKai
 * @version 1.0
 */
public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    @Override
    public abstract String getDescription();
}
