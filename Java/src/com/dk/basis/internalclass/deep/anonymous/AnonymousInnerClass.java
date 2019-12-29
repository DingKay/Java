package com.dk.basis.internalclass.deep.anonymous;

/**
 * @author DingKai
 * @date 2018/11/19
 *
 */
public class AnonymousInnerClass {

    public void printAnimal(AbstractAnimal animal){
        System.out.println(animal.getName() + " eat " + animal.eatFood());
    }

    public static void main(String[] args) {

        new AnonymousInnerClass().printAnimal(new AbstractAnimal(){
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
