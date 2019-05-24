package com.dk.design_patterns.decorate_coffee.abst;

/**
 * @author DingKai
 * @Classname CondimentDecorator
 * @Description The abstract class Condiment
 * @create 2019/2/19
 */
public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    @Override
    public abstract String getDescription();
}
