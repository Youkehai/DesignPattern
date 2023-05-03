package com.ykh.designmodel.strategy.duck;

import com.ykh.designmodel.strategy.fly.BadFlyBehavior;
import com.ykh.designmodel.strategy.fly.NoFlyBehavior;
import com.ykh.designmodel.strategy.quack.GagaQuack;

/**
 * 玩具鸭
 */
public class ToyDuck extends Duck{

    public ToyDuck() {
        super.flyBehavior=new NoFlyBehavior();
        super.quackBehavior=new GagaQuack();
    }

    @Override
    public void display() {
        System.out.println("我是玩具鸭");
    }
}
