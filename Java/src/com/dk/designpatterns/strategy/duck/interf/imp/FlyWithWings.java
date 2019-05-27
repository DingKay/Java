package com.dk.designpatterns.strategy.duck.interf.imp;

import com.dk.designpatterns.strategy.duck.interf.FlyBehavior;

/**
 * @author DingKai
 * @Classname FlyWithWings
 * @Description Duck fly with wings ,implement {@link FlyBehavior} Interface
 * @create 2019/2/11
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Duck is fly with wings");
    }
}
