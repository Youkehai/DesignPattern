package com.ykh.designmodel.factory.simplefactory;

import com.ykh.designmodel.factory.simplefactory.pizza.CheesePizza;
import com.ykh.designmodel.factory.simplefactory.pizza.GreekPizza;
import com.ykh.designmodel.factory.simplefactory.pizza.PepperPizza;
import com.ykh.designmodel.factory.simplefactory.pizza.Pizza;

/**
 * 简单工厂模式
 *
 * 1.简单工厂模式是属于创建型模式，是工厂模式的一种。简单工厂模式是由-个工厂对象决定创建出哪一种产品类的实例。
 *   简单工厂模式是工厂模式家族中最简单实用的模式
 * 2.简单工厂模式:定义了一个创建对象的类，由这个类来封装实例化对象的行为(代码)
 * 3.在软件开发中，当我们会用到大量的创建某种、某类或者某批对象时，就会使用到工厂模式
 */
public class SimpleFactory {

    /**
     * 根据类型创建对应的披萨对象
     * 还可以将此方法改为静态方法
     * @param type
     * @return
     */
    public Pizza createPizza(String type){
        Pizza pizza=null;
        if("greek".equals(type)){
            pizza=new GreekPizza();
        }else if("cheese".equals(type)){
            pizza=new CheesePizza();
        }else if("pepper".equals(type)){
            pizza=new PepperPizza();
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
