package com.ykh.designmodel.factory.simplefactory.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        name = "GreekPizza";
        System.out.println("GreekPizza");
    }
}
