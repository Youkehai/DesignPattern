package com.ykh.designmodel.singleton;

/**
 * 饿汉式单例
 * 如果确实要用该单例，则完全可以忽略缺点
 * 缺点：可能造成内存浪费
 * 优点：简单，避免了线程同步问题
 * 确定会用到该类时，推荐
 */
public class HungerSingleton1 {

    /**使用静态变量创建单例对象*/
    private final static HungerSingleton1 instance=new HungerSingleton1();

    private HungerSingleton1(){}

    public static HungerSingleton1 getInstance(){
        return instance;
    }
}
