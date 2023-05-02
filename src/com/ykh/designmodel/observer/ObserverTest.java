package com.ykh.designmodel.observer;

/**
 * 观察者测试类
 *
 * 对应源码：{@link java.util.Observable}
 */
public class ObserverTest {

    public static void main(String[] args) {
        //创建一个天气数据
        WeatherData weatherData = new WeatherData();
        //创建观察者
        Observer observer = new CurrentConditions();
        //注册观察者
        weatherData.registerObserver(observer);
        System.out.println("==================天气数据变化，更新==================");
        weatherData.changeData(1f,2f,3f);
        //新的观察者
        BaiduSite baiduSite = new BaiduSite();
        //注册观察者
        weatherData.registerObserver(baiduSite);
        System.out.println("==================天气数据变化，更新==================");
        weatherData.changeData(6f,7f,8f);
        //取消 CurrentConditions
        weatherData.removeObserver(observer);
        System.out.println("==================天气数据变化，更新==================");
        weatherData.changeData(10f,11f,12f);
    }
}
