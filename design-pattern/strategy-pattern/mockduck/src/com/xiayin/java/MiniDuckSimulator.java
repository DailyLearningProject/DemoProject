package com.xiayin.java;

import com.xiayin.java.behavior.impl.FlyRocketPowered;
import com.xiayin.java.entity.Duck;
import com.xiayin.java.entity.MallardDuck;
import com.xiayin.java.entity.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
