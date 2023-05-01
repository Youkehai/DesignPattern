package com.ykh.designmodel.command.light;

/**
 * light的实际执行者
 */
public class LightReceiver {

    public void on(){
        System.out.println("电灯打开了");
    }

    public void off(){
        System.out.println("电灯关闭了");
    }
}
