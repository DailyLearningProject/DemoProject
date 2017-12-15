package com.xiayin.java.starbuzzcoffee.decorate;

import com.xiayin.java.starbuzzcoffee.beverage.Beverage;

/**
 * 摩卡
 */
public class Mocha extends CondimentDecorator {

    // 用一个实例变量记录饮料，也就是被装饰者。
    private Beverage beverage;

    // 想办法让被装饰者(饮料)被记录到实例变量中。这里的做法是：把饮料当做构造器的参数，再由构造器将此饮料记录在实例变量中。
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    // 我们希望叙述不只是描述饮料(例如"DarkRost")，而是完整地连调料都描述出来(例如"DarkRoast, Mocha")。所以首先利用委托的做法，得到一个叙述，然后在其后加上附加的叙述(例如"Mocha")。
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
