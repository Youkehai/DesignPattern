package com.ykh.designmodel.factory.simplefactory.pizza;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        name="CheesePizza";
        System.out.println("CheesePizza准备");
    }
}
