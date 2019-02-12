package com.dk.designPatterns.design_patterns_duck;

import com.dk.designPatterns.design_patterns_duck.interf.FlyBehavior;
import com.dk.designPatterns.design_patterns_duck.interf.QuackBehavior;

/**
 * @author DingKai
 * @Classname Duck
 * @Description The Duck supertype
 * @create 2019/2/11
 */
public class Duck {
    String color;

    /*Declare two variables for the behavior interface type*/
    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    /*Set the behavior of the duck by "setter method"*/
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim(){
        System.out.println("Duck can swim");
    }
    public void display(){
        System.out.println("Duck is " + color);
    }

    /*Entrusted to behavior class*/
    public void performFly(){
        this.flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }
}
