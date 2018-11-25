package com.dk.internal.deep.anonymous;

/**
 * @author DingKai
 * @date 2018/11/19
 * @Description 匿名内部类
 */
public class AnonyMousInnerClass {

    public void printAnimal(Animal animal){
        System.out.println(animal.getName() + "吃" + animal.eatFood());
    }

    public static void main(String[] args) {

        new AnonyMousInnerClass().printAnimal(new Animal(){
            @Override
            public String eatFood() {
                return "虫子";
            }
            @Override
            public String getName() {
                return "小鸟";
            }
        });
    }
}
