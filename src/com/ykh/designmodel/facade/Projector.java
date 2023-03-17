package com.ykh.designmodel.facade;

/**
 * 投影仪
 */
public class Projector {

    private static Projector instance=new Projector();

    public static Projector getInstance(){
        return instance;
    }

    public void open(){
        System.out.println("投影仪机开机");
    }

    public void close(){
        System.out.println("投影仪机关机");
    }

    public void focus(){
        System.out.println("投影仪聚焦");
    }


}
