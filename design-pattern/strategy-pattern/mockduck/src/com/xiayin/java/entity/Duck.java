package com.xiayin.java.entity;

import com.xiayin.java.behavior.FlyBehavior;
import com.xiayin.java.behavior.QuackBehavior;

public abstract class Duck {
    /**
     * 飞行行为接口
     */
    protected FlyBehavior flyBehavior;

    /**
     * 呱呱叫行为接口
     */
    protected QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("鸭子在游泳！");
    }


    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
