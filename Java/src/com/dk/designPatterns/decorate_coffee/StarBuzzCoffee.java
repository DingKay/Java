package com.dk.designPatterns.decorate_coffee;

import com.dk.designPatterns.decorate_coffee.abst.Beverage;
import com.dk.designPatterns.decorate_coffee.decorate.Mocha;
import com.dk.designPatterns.decorate_coffee.decorate.Soy;
import com.dk.designPatterns.decorate_coffee.decorate.Whip;
import com.dk.utils.DK;

/**
 * @author DingKai
 * @Classname StarBuzzCoffee
 * @Description TODO
 * @create 2019/2/19
 */
public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        DK.print(beverage.getDescription() + " $" + beverage.cost());

        DK.printEqualSign();

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        DK.print(beverage2.getDescription() + " $" + beverage2.cost());

        DK.printEqualSign();

        /*BlackCoffee : Adding
        * Soy milk, default cup --> $1.15
        * now, choose venti cup --> $1.25*/
        Beverage beverage3 = new BlackCoffee();
        beverage3.setSize(Beverage.Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);

        DK.print(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
