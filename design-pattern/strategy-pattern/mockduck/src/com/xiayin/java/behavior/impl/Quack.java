package com.xiayin.java.behavior.impl;

import com.xiayin.java.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!!");
    }
}
