package com.ykh.designmodel.factory.factorymethod.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        name = "LDPepperPizza";
        System.out.println("LDPepperPizza");
    }
}
