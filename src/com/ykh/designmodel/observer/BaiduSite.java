package com.ykh.designmodel.observer;

/**
 * 新增加站点
 */
public class BaiduSite implements Observer{
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
     * 更新数据
     *
     * @param temperature
     * @param pressure
     * @param humidity
     */
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.display();
    }

    /**
     * 显示信息
     */
    public void display() {
        System.out.println("BaiduSite{" +
                ", humidity=" + humidity +
                "temperature=" + temperature +
                ", pressure=" + pressure +
                '}');
    }
}
