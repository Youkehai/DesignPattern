package com.ykh.designmodel.factory.factorymethod.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        name="LDCheesePizza";
        System.out.println("LDCheesePizza准备");
    }
}
