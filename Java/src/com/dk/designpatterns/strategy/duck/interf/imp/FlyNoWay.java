package com.dk.designpatterns.strategy.duck.interf.imp;

import com.dk.designpatterns.strategy.duck.interf.FlyBehavior;

/**
 * Duck fly no way ,implement {@link FlyBehavior} interface
 * @author DingKai
 * @version 1.0
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Duck is nothing to do");
    }
}
