package com.ykh.designmodel.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.包含最新天气数据
 * 2.包含所有观察者的list
 * 3.数据更新时，通知所有观察者
 */
public class WeatherData implements Subject{

    /**
     * 所有的观察者
     */
    private List<Observer> observers;
    /**
     * 温度
     */
    private float temperature;
    /**
     * 气压
     */
    private float pressure;
    /**
     * 湿度
     */
    private float humidity;

    /**
     * 天气数据变化，更新自己的数据，并通知所有观察者
     */
    public void changeData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        if(observers==null){
            observers=new ArrayList<>();
        }
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        if(observers!=null){
            for (Observer observer : observers) {
                observer.update(temperature,pressure,humidity);
            }
        }
    }
}
