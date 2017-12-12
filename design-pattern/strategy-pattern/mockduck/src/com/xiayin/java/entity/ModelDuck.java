package com.xiayin.java.entity;

import com.xiayin.java.behavior.impl.FlyNoWay;
import com.xiayin.java.behavior.impl.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
