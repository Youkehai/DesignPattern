package com.ykh.designmodel.command.tv;

/**
 * light的实际执行者
 */
public class TvReceiver {

    public void on(){
        System.out.println("电视机打开了");
    }

    public void off(){
        System.out.println("电视机关闭了");
    }
}
