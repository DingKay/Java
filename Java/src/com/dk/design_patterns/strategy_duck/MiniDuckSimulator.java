package com.dk.design_patterns.strategy_duck;

import com.dk.design_patterns.strategy_duck.interf_imp.FlyNoWay;
import com.dk.design_patterns.strategy_duck.interf_imp.MuteQuack;
import com.dk.util.Out;

/**
 * @author DingKai
 * @Classname MiniDuckSimulator
 * @Description To test {@link MallardDuck} class
 * @create 2019/2/11
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Out.printEqualSign();

        Out.print("<< Default >>");
        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();

        /*The duck by "setter method"*/
        Out.print("<< by \"setter method\" After >>");
        model.setFlyBehavior(new FlyNoWay());
        model.setQuackBehavior(new MuteQuack());
        model.performFly();
        model.performQuack();
    }
}
