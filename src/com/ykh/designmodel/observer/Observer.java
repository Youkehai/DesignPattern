package com.ykh.designmodel.observer;

/**
 * 所有观察者的抽象层
 */
public interface Observer {

    /**
     * 更新观察者的数据抽象方法
     * @param temperature
     * @param pressure
     * @param humidity
     */
    void update(float temperature,float pressure,float humidity);
}
