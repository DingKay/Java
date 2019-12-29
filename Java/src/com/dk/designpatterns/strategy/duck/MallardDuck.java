package com.dk.designpatterns.strategy.duck;

import com.dk.designpatterns.strategy.duck.interf.imp.FlyWithWings;
import com.dk.designpatterns.strategy.duck.interf.imp.Quack;

/**
 * Concrete implementation class
 * @author DingKai
 * @version 1.0
 */
public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
