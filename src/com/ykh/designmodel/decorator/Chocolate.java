package com.ykh.designmodel.decorator;

/**
 * 具体调味品--巧克力
 */
public class Chocolate  extends Decorator{
    public Chocolate(Drink obj) {
        super(obj);
        setDes("调味品 巧克力");
        setPrice(3);
    }
}
