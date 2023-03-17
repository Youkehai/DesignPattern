package com.ykh.designmodel.builder;

/**
 * 建造者模式中的具体建造者ConcreteBuilder
 * 子类2
 */
public class ConcreteProductTwoBuilder extends  ProductBuilder{
    @Override
    public void step1() {
        System.out.println("具体实现子类22222方法1");
    }

    @Override
    public void step2() {
        System.out.println("具体实现子类22222方法2");
    }

    @Override
    public void step3() {
        System.out.println("具体实现子类22222方法3");
    }
}
