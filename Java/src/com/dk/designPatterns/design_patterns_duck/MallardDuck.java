package com.dk.designPatterns.design_patterns_duck;

import com.dk.designPatterns.design_patterns_duck.interf_imp.FlyWithWings;
import com.dk.designPatterns.design_patterns_duck.interf_imp.Quack;

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
