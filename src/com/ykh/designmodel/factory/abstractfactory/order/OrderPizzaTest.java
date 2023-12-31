package com.ykh.designmodel.factory.abstractfactory.order;

import com.ykh.designmodel.factory.abstractfactory.AbstractFactory;
import com.ykh.designmodel.factory.abstractfactory.BJFactory;
import com.ykh.designmodel.factory.abstractfactory.pizza.Pizza;

/**
 * 披萨订购的工厂父类
 */
public class OrderPizzaTest {

    AbstractFactory abstractFactory;

    public AbstractFactory getAbstractFactory() {
        return abstractFactory;
    }

    /**
     * abstractFactory为具体实现类
     * @param abstractFactory
     */
    public OrderPizzaTest(AbstractFactory abstractFactory){
        this.abstractFactory = abstractFactory;
    }

    public void usePizza(String type){
        Pizza pizza = abstractFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    public static void main(String[] args) {
        OrderPizzaTest orderPizzaTest = new OrderPizzaTest(new BJFactory());
        orderPizzaTest.usePizza("cheese");
    }


}
