package com.dk.designpatterns.strategy.duck.interf.imp;

import com.dk.designpatterns.strategy.duck.interf.QuackBehavior;

/**
 * @author DingKai
 * @Classname MuteQuack
 * @Description Duck Quack ,implement {@link QuackBehavior} interface
 * @create 2019/2/11
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Duck is Silence");
    }
}
