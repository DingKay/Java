package com.dk.annotation;

/**
 * @author DingKai
 * @Classname Animal
 * @Description To Learn Java Annotation : Three Basic Annotation
 * @create 2019/1/8
 */
@SuppressWarnings("unchecked")
public class Animal {
    public void eat(){
        System.out.println("Animal Eat Method");
    }

    class DogInner extends Animal{
        @Override
        public void eat() {
            System.out.println("Dog Eat Method");
        }

        @Deprecated
        public void run(){
            System.out.println("Dog Run Method");
        }
    }
    public static void main(String[] args) {
        Animal.DogInner dogInner = new Animal().new DogInner();

        Dog dog = new Dog();

        dogInner.run();

        dog.run();
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog Eat Method");
    }

    @Deprecated
    public void run(){
        System.out.println("Dog Run Method");
    }
}
