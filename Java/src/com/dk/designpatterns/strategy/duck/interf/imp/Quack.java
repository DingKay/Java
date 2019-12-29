package com.dk.designpatterns.strategy.duck.interf.imp;

import com.dk.designpatterns.strategy.duck.interf.QuackBehavior;

/**
 * Duck quack ,implement {@link QuackBehavior} Interface
 * @author DingKai
 * @version 1.0
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Duck is quack");
    }
}
