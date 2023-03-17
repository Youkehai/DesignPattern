package com.ykh.designmodel.decorator;

/**
 * 具体调味品--豆浆
 */
public class Soy extends Decorator{
    public Soy(Drink obj) {
        super(obj);
        setDes("调味品 豆浆");
        setPrice(2);
    }
}
