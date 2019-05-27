package com.dk.designpatterns.strategy.duck.interf.imp;

import com.dk.designpatterns.strategy.duck.interf.QuackBehavior;

/**
 * @author DingKai
 * @Classname Squeak
 * @Description Duck quack ,implement {@link QuackBehavior} Interface
 * @create 2019/2/11
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Duck is squeak");
    }
}
