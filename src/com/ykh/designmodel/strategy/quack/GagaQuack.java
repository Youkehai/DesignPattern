package com.ykh.designmodel.strategy.quack;

public class GagaQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("嘎嘎叫");
    }
}
