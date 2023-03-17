package com.ykh.designmodel.factory.factorymethod;

import com.ykh.designmodel.factory.factorymethod.order.BJOrderPizza;
import com.ykh.designmodel.factory.factorymethod.order.LDOrderPizza;

/**
 * 工厂方法模式
 * 定义了一个创建对象的抽象方法，由子类决定要实例化的类。工厂方法模式将对象的实例化推迟到子类。
 */
public class FactoryMethod {
    public static void main(String[] args) {
        //创建背景口味披萨
        new BJOrderPizza("cheese");
        //创建伦敦口味披萨
        new LDOrderPizza("pepper");
    }
}
