package com.ykh.designmodel.factory.abstractfactory.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        name = "LDPepperPizza";
        System.out.println("LDPepperPizza");
    }
}
