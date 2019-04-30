package com.dk.feature.inherit.issue.obj;

import org.jetbrains.annotations.Contract;

/**
 * @author DingKai
 * @Classname Animal
 * @Description base class
 * @date 2019/4/30
 */
public class Animal {
    private int legNum;
    private String foodKind;

    @Contract(pure = true)
    public Animal() {

    }

    public void animalSet(int leg, String food) {
        this.legNum = leg;
        this.foodKind = food;
    }

    public void display() {
        System.out.print("leg：" + this.legNum + " eat：" + this.foodKind);
    }
}
