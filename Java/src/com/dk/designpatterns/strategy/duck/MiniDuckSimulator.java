package com.dk.designpatterns.strategy.duck;

import com.dk.designpatterns.strategy.duck.interf.imp.FlyNoWay;
import com.dk.designpatterns.strategy.duck.interf.imp.MuteQuack;
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

        Out.printEqualSign(30);

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
