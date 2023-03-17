package com.ykh.designmodel.factory.factorymethod.order;

import com.ykh.designmodel.factory.factorymethod.pizza.Pizza;

/**
 * 披萨订购的工厂父类
 */
public abstract class OrderPizza {
    //由工厂子类去实现方法
    abstract Pizza createPizza(String type);

    public OrderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }


}
