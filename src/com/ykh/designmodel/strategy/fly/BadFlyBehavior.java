package com.ykh.designmodel.strategy.fly;

/**
 * 不会飞的鸭子
 */
public class BadFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("只能稍微飞一下");
    }
}
