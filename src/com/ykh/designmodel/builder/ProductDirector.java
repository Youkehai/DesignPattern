package com.ykh.designmodel.builder;

/**
 * 建造者模式中的指挥者（Director）
 */
public class ProductDirector {
    //聚合抽象建造者
    ProductBuilder productBuilder;

    /**
     * 构造器传入
     * @param productBuilder
     */
    public ProductDirector(ProductBuilder productBuilder) {
        this.productBuilder = productBuilder;
    }

    /**
     * set传入
     * @param productBuilder
     */
    public void setProductBuilder(ProductBuilder productBuilder) {
        this.productBuilder = productBuilder;
    }

    /**
     * 具体如何创建product，由指挥者决定
     * @return
     */
    public Product executeStep(){
        productBuilder.step1();
        productBuilder.step2();
        productBuilder.step3();
        return productBuilder.getResult();
    }
}
