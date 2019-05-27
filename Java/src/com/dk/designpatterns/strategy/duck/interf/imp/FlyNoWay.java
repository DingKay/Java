package com.dk.designpatterns.strategy.duck.interf.imp;

import com.dk.designpatterns.strategy.duck.interf.FlyBehavior;

/**
 * @author DingKai
 * @Classname FlyNoWay
 * @Description Duck fly no way ,implement {@link FlyBehavior} interface
 * @create 2019/2/11
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Duck is nothing to do");
    }
}
