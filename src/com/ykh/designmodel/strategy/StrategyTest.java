package com.ykh.designmodel.strategy;

import com.ykh.designmodel.strategy.duck.BeiJingDuck;
import com.ykh.designmodel.strategy.duck.ToyDuck;
import com.ykh.designmodel.strategy.duck.WildDuck;

import java.util.Comparator;

/**
 * 策略模式
 *
 * 在JDK源码中的应用
 * {@link java.util.Comparator} 为策略接口
 * {@link java.util.Arrays#sort(Object[], Comparator)}}
 */
public class StrategyTest {

    public static void main(String[] args) {
        //创建三个不同的鸭子
        WildDuck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();
        wildDuck.quack();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();
        toyDuck.quack();

        BeiJingDuck beiJingDuck = new BeiJingDuck();
        beiJingDuck.display();
        beiJingDuck.fly();
        beiJingDuck.quack();
    }
}
