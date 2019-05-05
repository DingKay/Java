package com.dk.design_patterns.strategy_duck.interf_imp;

import com.dk.design_patterns.strategy_duck.interf.FlyBehavior;

/**
 * @author DingKai
 * @Classname FlyWithWings
 * @Description Duck fly with wings ,implement {@link FlyBehavior} Interface
 * @create 2019/2/11
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Duck is fly with wings");
    }
}