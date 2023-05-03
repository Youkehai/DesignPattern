package com.ykh.designmodel.strategy.duck;

import com.ykh.designmodel.strategy.fly.BadFlyBehavior;
import com.ykh.designmodel.strategy.quack.GagaQuack;

/**
 * 北京鸭
 */
public class BeiJingDuck extends Duck{

    public BeiJingDuck() {
        super.flyBehavior=new BadFlyBehavior();
        super.quackBehavior=new GagaQuack();
    }

    @Override
    public void display() {
        System.out.println("我是北京鸭");
    }
}
