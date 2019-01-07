package com.dk.enumerate;

/**
 * @author DingKai
 * @Classname InterfaceEnum
 * @Description To Learn Enumerate 6: U Can Use Interface To Manage Enumerate
 * @create 2019/1/7
 */
public class InterfaceEnum {
    interface Food {
        enum Coffee implements Food{
            BLACK_COFFE,DECAF_COFFE,CAPPUCCINO
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
        Food food = Food.Coffee.BLACK_COFFE;
        System.out.println("food = " + food);

        food = Food.Dessert.CAKE;
        System.out.println("food = " + food);
    }
}
