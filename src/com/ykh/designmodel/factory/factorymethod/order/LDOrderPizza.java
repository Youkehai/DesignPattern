package com.ykh.designmodel.factory.factorymethod.order;

import com.ykh.designmodel.factory.factorymethod.pizza.*;

public class LDOrderPizza extends OrderPizza{
    public LDOrderPizza(String type) {
        super(type);
    }

    @Override
    Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new LDCheesePizza();
        }
        if("pepper".equals(type)){
            return new LDPepperPizza();
        }
        return null;
    }
}
