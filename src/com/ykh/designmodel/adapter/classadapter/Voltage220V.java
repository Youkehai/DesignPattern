package com.ykh.designmodel.adapter.classadapter;

/**
 * 被适配的类
 */
public class Voltage220V {

    /**
     * 输出220v电压
     * @return
     */
    public int output(){
        System.out.println("220v电压");
        return 220;
    }
}
