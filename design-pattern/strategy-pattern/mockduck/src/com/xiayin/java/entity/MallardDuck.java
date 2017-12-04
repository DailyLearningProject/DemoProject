package com.xiayin.java.entity;

import com.xiayin.java.behavior.impl.FlyWithWings;
import com.xiayin.java.behavior.impl.Quack;

/**
 * 野鸭
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
