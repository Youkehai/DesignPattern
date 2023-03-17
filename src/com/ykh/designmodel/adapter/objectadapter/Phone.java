package com.ykh.designmodel.adapter.objectadapter;

/**
 *
 */
public class Phone {
    /**
     * 充电
     */
    public void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V() == 5) {
            System.out.println("可以正常充电");
        }else if(iVoltage5V.output5V()<5){
            System.out.println("电压小于5v，不能充电");
        }else{
            System.out.println("电压大于5v，不能充电");
        }
    }
}
