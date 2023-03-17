package com.ykh.designmodel.factory.abstractfactory;

import com.ykh.designmodel.factory.abstractfactory.pizza.BJCheesePizza;
import com.ykh.designmodel.factory.abstractfactory.pizza.BJPepperPizza;
import com.ykh.designmodel.factory.abstractfactory.pizza.Pizza;

public class BJFactory  implements AbstractFactory{

    @Override
    public Pizza createPizza(String type) {
        System.out.println("使用抽象工厂模式，BJFactory");
        if("cheese".equals(type)){
            return new BJCheesePizza();
        }
        if("pepper".equals(type)){
            return new BJPepperPizza();
        }
        return null;
    }
}
