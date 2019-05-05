package com.dk.design_patterns.decorate_coffee.abst;

/**
 * @author DingKai
 * @Classname Beverage
 * @Description The abstract class Beverage
 * @create 2019/2/19
 */
public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI}

    public Size size = Size.TALL;
    /*This type is not declared as 'public' in the source code.
    * because the class is in the same package
    * At this time, the new 'abst' package is created and needs to be declared as 'public' type.*/
    public String description = "UnKnown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Size getSize(){
        return this.size;
    }

    public void setSize(Size size){
        this.size = size;
    }
}
