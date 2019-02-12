package com.dk.designPatterns.design_patterns_duck.interf_imp;

import com.dk.designPatterns.design_patterns_duck.interf.QuackBehavior;

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
