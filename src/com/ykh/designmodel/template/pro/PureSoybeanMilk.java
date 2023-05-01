package com.ykh.designmodel.template.pro;

/**
 * 纯豆浆，不加配料
 */
public class PureSoybeanMilk extends SoybeanMilk{
    @Override
    void addCondiments() {

    }

    /**
     * 不加入任何配料的纯豆浆
     * @return
     */
    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
