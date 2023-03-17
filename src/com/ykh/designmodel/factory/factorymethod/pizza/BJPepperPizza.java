package com.ykh.designmodel.factory.factorymethod.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        name = "BJPepperPizza";
        System.out.println("BJPepperPizza");
    }
}
