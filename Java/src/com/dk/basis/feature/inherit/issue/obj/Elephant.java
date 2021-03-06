package com.dk.basis.feature.inherit.issue.obj;

import java.lang.reflect.Field;

/**
 * Common subclass
 * @author DingKai
 * @version 1.0
 */
public class Elephant extends Animal {
    private int weight;
    private int lifeSpan;
    private String animal;
    /**
     * This attribute is for the following comparison 'equals' method, is coding standard
     */
    private String leg = "legNum";
    private String food = "foodKind";

    public Elephant(String animal) {
        this.animal = animal;
    }

    public void elephantSet(int legNum,String foodKind,int weight,int lifeSpan) {
        // common change value
        this.weight = weight;
        this.lifeSpan = lifeSpan;
        // use reflect to change value
        Class<?> clazz = this.getClass().getSuperclass();
        Field[] declaredFields = clazz.getDeclaredFields();
        try {
            for (Field declaredField : declaredFields) {
                if (declaredField.getName().equals(leg)) {
                    declaredField.setAccessible(true);
                    declaredField.set(this, legNum);
                }
                if (declaredField.getName().equals(food)) {
                    declaredField.setAccessible(true);
                    declaredField.set(this, foodKind);
                }
            }
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void display() {
        System.out.println("Elephant.display");
        super.display();
        System.out.println(" weight：" + this.weight + " life：" + this.lifeSpan);
    }
}
