package com.ykh.designmodel.factory.simplefactory.pizza;

public class PepperPizza  extends Pizza {
    @Override
    public void prepare() {
        name = "PepperPizza";
        System.out.println("PepperPizza");
    }
}
