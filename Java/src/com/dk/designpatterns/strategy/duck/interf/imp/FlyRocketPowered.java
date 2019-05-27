package com.dk.designpatterns.strategy.duck.interf.imp;

import com.dk.designpatterns.strategy.duck.interf.FlyBehavior;

/**
 * @author DingKai
 * @Classname FlyRocketPowered
 * @Description Duck fly with rocket power ,implement {@link FlyBehavior} interface
 * @create 2019/2/11
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i'm flying with a rocket!");
    }
}
