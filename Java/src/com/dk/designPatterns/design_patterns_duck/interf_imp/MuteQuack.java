package com.dk.designPatterns.design_patterns_duck.interf_imp;

import com.dk.designPatterns.design_patterns_duck.interf.QuackBehavior;

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
