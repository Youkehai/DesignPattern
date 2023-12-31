package com.ykh.designmodel.builder;

/**
 * 建造者模式中的产品Product
 */
public class Product {
    /**
     * 举例的属性
     */
    private String attr1;

    private String attr2;

    private String attr3;

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public String getAttr3() {
        return attr3;
    }

    public void setAttr3(String attr3) {
        this.attr3 = attr3;
    }
}
