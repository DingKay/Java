package com.dk.designpatterns.strategy.duck;

import com.dk.designpatterns.strategy.duck.interf.imp.FlyNoWay;
import com.dk.designpatterns.strategy.duck.interf.imp.Quack;

/**
 * Concrete implementation class
 * @author DingKai
 * @version 1.0
 */
public class ModelDuck extends Duck {

    ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
