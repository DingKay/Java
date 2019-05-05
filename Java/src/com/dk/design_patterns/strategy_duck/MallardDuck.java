package com.dk.design_patterns.strategy_duck;

import com.dk.design_patterns.strategy_duck.interf_imp.FlyWithWings;
import com.dk.design_patterns.strategy_duck.interf_imp.Quack;

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
