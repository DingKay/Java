package com.dk.internal.deep.anonymous;

/**
 * @author DingKai
 * @date 2018/11/19
 * @Description
 */
public class AnonyMousInnerClass {

    public void printAnimal(Animal animal){
        System.out.println(animal.getName() + " eat " + animal.eatFood());
    }

    public static void main(String[] args) {

        new AnonyMousInnerClass().printAnimal(new Animal(){
            @Override
            public String eatFood() {
                return "insect";
            }
            @Override
            public String getName() {
                return "bird";
            }
        });
    }
}
