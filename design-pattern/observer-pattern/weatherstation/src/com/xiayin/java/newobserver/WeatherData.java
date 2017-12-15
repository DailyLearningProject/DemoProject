package com.xiayin.java.newobserver;

import java.util.Observable;

/**
 * 继承java内置的Observable类，不再需要追踪观察者了，也不需要管理注册与删除(让超类代劳即可)。
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    // 构造器不在需要为了记住观察者们而建立数据结构了。
    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged(); // 在调用notifyObservers()之前，要先调用setChanged()来指示状态已经改变。
        notifyObservers(); // 我们没有调用notifyObservers()传送数据对象，这表示我们采用的做法是"拉"
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


    // 这些并不是新方法，只是我们也要使用"拉"的做法，所以才提醒有这些方法。观察者会利用这些方法取得WeatherData对象状态
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
