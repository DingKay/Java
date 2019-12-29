package com.dk.designpatterns.decorate.coffee.abst;

/**
 * The abstract class Beverage
 * @author DingKai
 * @version 1.0
 */
public abstract class Beverage {
    public enum Size {
        /**
         * this is enum comment
         */
        TALL, GRANDE, VENTI}

    public Size size = Size.TALL;
    /**
     * This type is not declared as 'public' in the source code.
     * because the class is in the same package
     * At this time, the new 'abst' package is created and needs to be declared as 'public' type.
     */
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
