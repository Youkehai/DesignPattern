package com.ykh.designmodel.strategy.duck;

import com.ykh.designmodel.strategy.fly.GoodFlyBehavior;
import com.ykh.designmodel.strategy.quack.GagaQuack;
import com.ykh.designmodel.strategy.quack.NoQuackBehavior;

public class WildDuck extends Duck{

    /**
     * 构造器设置具体飞行策略
     */
    public WildDuck() {
        super.flyBehavior=new GoodFlyBehavior();
        super.quackBehavior=new NoQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("野鸭");
    }
}
