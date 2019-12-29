package com.dk.basis.enumerate;

/**
 * To Learn Enumerate 6: U Can Use Interface To Manage Enumerate
 * @author DingKai
 * @version 1.0
 */
public class InterfaceEnum {
    interface Food {
        enum Coffee implements Food{
            BLACK_COFFEE, DECAF_COFFEE,CAPPUCCINO
        }

        enum Dessert implements Food{
            FRUIT,CAKE
        }
    }

    public static void main(String[] args) {
        for (Food.Coffee coffee :
                Food.Coffee.values()) {
            System.out.print(coffee.ordinal() + "\t");
            System.out.println(coffee.name());
        }
        Food food = Food.Coffee.BLACK_COFFEE;
        System.out.println("food = " + food);

        food = Food.Dessert.CAKE;
        System.out.println("food = " + food);
    }
}
