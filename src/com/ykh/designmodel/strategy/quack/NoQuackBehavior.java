package com.ykh.designmodel.strategy.quack;

public class NoQuackBehavior implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
