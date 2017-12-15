package com.xiayin.java.starbuzzcoffee;

import com.xiayin.java.starbuzzcoffee.beverage.Beverage;
import com.xiayin.java.starbuzzcoffee.beverage.DarkRoast;
import com.xiayin.java.starbuzzcoffee.beverage.Espresso;
import com.xiayin.java.starbuzzcoffee.beverage.HouseBlend;
import com.xiayin.java.starbuzzcoffee.decorate.Mocha;
import com.xiayin.java.starbuzzcoffee.decorate.Soy;
import com.xiayin.java.starbuzzcoffee.decorate.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

    }
}
