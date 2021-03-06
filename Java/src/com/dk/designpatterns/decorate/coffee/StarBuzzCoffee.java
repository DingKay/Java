package com.dk.designpatterns.decorate.coffee;

import com.dk.designpatterns.decorate.coffee.abst.Beverage;
import com.dk.designpatterns.decorate.coffee.decorate.Mocha;
import com.dk.designpatterns.decorate.coffee.decorate.Soy;
import com.dk.designpatterns.decorate.coffee.decorate.Whip;
import com.dk.util.Out;

/**
 * Drink Shop
 * @author DingKai
 * @version 1.0
 */
public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        Out.print(beverage.getDescription() + " $" + beverage.cost());

        Out.printEqualSign(30);

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        Out.print(beverage2.getDescription() + " $" + beverage2.cost());

        Out.printEqualSign(30);

        /*BlackCoffee : Adding
        * Soy milk, default cup --> $1.15
        * now, choose venti cup --> $1.25*/
        Beverage beverage3 = new BlackCoffee();
        /*Test : beverage3 at below is not the same*/
        Beverage temp = beverage3;
        /*must be true*/
        Out.print(temp == beverage3);
        beverage3.setSize(Beverage.Size.VENTI);
        beverage3 = new Soy(beverage3);
        /*not the same object , is 'false'
        * the below same reason*/
        Out.print(temp == beverage3);
        beverage3 = new Whip(beverage3);

        Out.print(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
