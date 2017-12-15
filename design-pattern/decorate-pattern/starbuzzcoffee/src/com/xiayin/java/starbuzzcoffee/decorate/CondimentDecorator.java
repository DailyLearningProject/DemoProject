package com.xiayin.java.starbuzzcoffee.decorate;

import com.xiayin.java.starbuzzcoffee.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    // 所有的调料装饰者都必须重新实现getDescription()方法。
    @Override
    public abstract String getDescription();
}
