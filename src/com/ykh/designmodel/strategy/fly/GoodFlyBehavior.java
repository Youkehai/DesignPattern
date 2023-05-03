package com.ykh.designmodel.strategy.fly;

/**
 * 不会飞的鸭子
 */
public class GoodFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞得很好");
    }
}
