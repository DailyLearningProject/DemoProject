package com.xiayin.java.observer;

public interface Observer {
    /**
     * 当气象观测值改变时，主题会把这些状态值当做方法参数，传给观察者。所有的观察者必须实现update方法。
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    void update(float temperature,float humidity,float  pressure);
}
