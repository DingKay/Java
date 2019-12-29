package com.dk.designpatterns.strategy.duck.interf.imp;

import com.dk.designpatterns.strategy.duck.interf.FlyBehavior;

/**
 * Duck fly with rocket power ,implement {@link FlyBehavior} interface
 * @author DingKai
 * @version 1.0
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i'm flying with a rocket!");
    }
}
