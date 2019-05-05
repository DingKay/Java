package com.dk.design_patterns.strategy_duck.interf_imp;

import com.dk.design_patterns.strategy_duck.interf.QuackBehavior;

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
