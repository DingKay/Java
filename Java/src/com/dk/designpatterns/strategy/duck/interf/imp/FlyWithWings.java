package com.dk.designpatterns.strategy.duck.interf.imp;

import com.dk.designpatterns.strategy.duck.interf.FlyBehavior;

/**
 * Duck fly with wings ,implement {@link FlyBehavior} Interface
 * @author DingKai
 * @version 1.0
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Duck is fly with wings");
    }
}
