package com.ykh.designmodel.factory.abstractfactory.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        name = "BJPepperPizza";
        System.out.println("BJPepperPizza");
    }
}
