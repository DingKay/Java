package com.dk.designpatterns.strategy.duck.interf.imp;

import com.dk.designpatterns.strategy.duck.interf.QuackBehavior;

/**
 * Duck Quack ,implement {@link QuackBehavior} interface
 * @author DingKai
 * @version 1.0
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Duck is Silence");
    }
}
