package com.dk.designPatterns.design_patterns_coffee.abst;

/**
 * @author DingKai
 * @Classname Beverage
 * @Description TODO
 * @create 2019/2/19
 */
public abstract class Beverage {
    /*This type is not declared as 'public' in the source code.
    * because the class is in the same package
    * At this time, the new 'abst' package is created and needs to be declared as 'public' type.*/
    public String description = "UnKnown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
