package com.dk.designPatterns.strategy_duck;

import com.dk.designPatterns.strategy_duck.interf_imp.FlyNoWay;
import com.dk.designPatterns.strategy_duck.interf_imp.Quack;

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
