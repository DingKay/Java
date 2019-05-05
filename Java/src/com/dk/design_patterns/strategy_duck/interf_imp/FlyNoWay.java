package com.dk.design_patterns.strategy_duck.interf_imp;

import com.dk.design_patterns.strategy_duck.interf.FlyBehavior;

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
