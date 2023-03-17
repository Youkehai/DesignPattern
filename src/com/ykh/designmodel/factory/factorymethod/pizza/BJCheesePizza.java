package com.ykh.designmodel.factory.factorymethod.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        name="BJCheesePizza";
        System.out.println("BJCheesePizza准备");
    }
}
