package com.dk.designpatterns.strategy.duck.interf.imp;

import com.dk.designpatterns.strategy.duck.interf.QuackBehavior;

/**
 * @author DingKai
 * @Classname Quack
 * @Description Duck quack ,implement {@link QuackBehavior} Interface
 * @create 2019/2/11
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Duck is quack");
    }
}
