package com.xiayin.java.starbuzzcoffee.beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    // 需要计算Espresso的价钱，
    @Override
    public double cost() {
        return 1.99;
    }
}
