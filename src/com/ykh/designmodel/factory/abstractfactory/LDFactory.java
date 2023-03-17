package com.ykh.designmodel.factory.abstractfactory;

import com.ykh.designmodel.factory.abstractfactory.pizza.*;

public class LDFactory implements AbstractFactory{

    @Override
    public Pizza createPizza(String type) {
        System.out.println("使用抽象工厂模式，LDFactory");
        if("cheese".equals(type)){
            return new LDCheesePizza();
        }
        if("pepper".equals(type)){
            return new LDPepperPizza();
        }
        return null;
    }
}
