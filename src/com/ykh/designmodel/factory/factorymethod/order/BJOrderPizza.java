package com.ykh.designmodel.factory.factorymethod.order;

import com.ykh.designmodel.factory.factorymethod.pizza.BJCheesePizza;
import com.ykh.designmodel.factory.factorymethod.pizza.BJPepperPizza;
import com.ykh.designmodel.factory.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{
    public BJOrderPizza(String type) {
        super(type);
    }

    @Override
    Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new BJCheesePizza();
        }
        if("pepper".equals(type)){
            return new BJPepperPizza();
        }
        return null;
    }
}
