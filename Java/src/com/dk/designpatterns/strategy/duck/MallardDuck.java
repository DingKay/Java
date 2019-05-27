package com.dk.designpatterns.strategy.duck;

import com.dk.designpatterns.strategy.duck.interf.imp.FlyWithWings;
import com.dk.designpatterns.strategy.duck.interf.imp.Quack;

/**
 * @author DingKai
 * @Classname MallardDuck
 * @Description Concrete implementation class
 * @create 2019/2/11
 */
public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
