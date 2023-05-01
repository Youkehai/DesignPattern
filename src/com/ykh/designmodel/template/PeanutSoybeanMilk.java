package com.ykh.designmodel.template;

/**
 * 花生豆浆
 */
public class PeanutSoybeanMilk extends SoybeanMilk{
    @Override
    void addCondiments() {
        System.out.println("加入了配料为花生");
    }
}
