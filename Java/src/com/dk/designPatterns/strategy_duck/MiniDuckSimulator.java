package com.dk.designPatterns.strategy_duck;

import com.dk.designPatterns.strategy_duck.interf_imp.FlyNoWay;
import com.dk.designPatterns.strategy_duck.interf_imp.MuteQuack;
import com.dk.utils.DK;

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

        DK.printEqualSign();

        DK.print("<< Default >>");
        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();

        /*The duck by "setter method"*/
        DK.print("<< by \"setter method\" After >>");
        model.setFlyBehavior(new FlyNoWay());
        model.setQuackBehavior(new MuteQuack());
        model.performFly();
        model.performQuack();
    }
}
