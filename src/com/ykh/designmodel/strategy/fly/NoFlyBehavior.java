package com.ykh.designmodel.strategy.fly;

/**
 * 不会飞的鸭子
 */
public class NoFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
