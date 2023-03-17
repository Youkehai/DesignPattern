package com.ykh.designmodel.factory.simplefactory;

import com.ykh.designmodel.factory.simplefactory.pizza.CheesePizza;
import com.ykh.designmodel.factory.simplefactory.pizza.GreekPizza;
import com.ykh.designmodel.factory.simplefactory.pizza.PepperPizza;
import com.ykh.designmodel.factory.simplefactory.pizza.Pizza;

public class OrderPizza {

    public OrderPizza(){
        setSimpleFactory(new SimpleFactory());
    }
    //简单工厂对象
    SimpleFactory simpleFactory;
    public void setSimpleFactory(SimpleFactory simpleFactory){
        this.simpleFactory=simpleFactory;
    }
    public Pizza createPizza(String type){
        Pizza pizza = this.simpleFactory.createPizza(type);
        if(pizza==null){
            System.out.println("类型错误");
        }
        return pizza;
    }
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.createPizza("cheese");
    }
}
