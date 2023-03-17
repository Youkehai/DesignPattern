package com.ykh.designmodel.decorator;

/**
 * 单品咖啡
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
