package com.dk.designpatterns.strategy.duck;

import com.dk.designpatterns.strategy.duck.interf.imp.FlyNoWay;
import com.dk.designpatterns.strategy.duck.interf.imp.Quack;

/**
 * @author DingKai
 * @Classname ModelDuck
 * @Description Concrete implementation class
 * @create 2019/2/11
 */
public class ModelDuck extends Duck {

    ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
