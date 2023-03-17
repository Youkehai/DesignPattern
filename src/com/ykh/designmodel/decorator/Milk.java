package com.ykh.designmodel.decorator;

/**
 * 具体调味品--N牛奶
 */
public class Milk extends Decorator{
    public Milk(Drink obj) {
        super(obj);
        setDes("调味品 牛奶");
        setPrice(5);
    }
}
