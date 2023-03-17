package com.ykh.designmodel.builder;

/**
 * 建造者模式中的具体建造者ConcreteBuilder
 * 子类1
 */
public class ConcreteProductBuilder extends  ProductBuilder{
    @Override
    public void step1() {
        System.out.println("具体实现子类11111方法1");
    }

    @Override
    public void step2() {
        System.out.println("具体实现子类11111方法2");
    }

    @Override
    public void step3() {
        System.out.println("具体实现子类111111方法3");
    }
}
