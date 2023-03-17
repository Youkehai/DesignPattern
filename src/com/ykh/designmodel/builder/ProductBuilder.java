package com.ykh.designmodel.builder;

/**
 * 建造者模式中的抽象建造者Builder(接口或者抽象类)
 */
public abstract class ProductBuilder {
    protected Product product=new Product();
    /**
    *举例建造流程抽象方法
     */
    public abstract void step1();

    public abstract void step2();

    public abstract void step3();

    /**
     * 建好产品后，返回具体产品
     * @return
     */
    public Product getResult(){
        return product;
    }
}
