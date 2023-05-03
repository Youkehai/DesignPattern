package com.ykh.designmodel.strategy.duck;

import com.ykh.designmodel.strategy.fly.FlyBehavior;
import com.ykh.designmodel.strategy.quack.QuackBehavior;

public abstract class Duck {
    //聚合策略接口
    FlyBehavior flyBehavior;
    /**
     * 聚合叫声策略接口
     */
    QuackBehavior quackBehavior;

    /**
     * 显示鸭子名字
     */
    public abstract void display();

    public void quack(){
        if(quackBehavior!=null){
            quackBehavior.quack();
        }
    }

    public void fly(){
        if(flyBehavior!=null){
            flyBehavior.fly();
        }
    }
}
