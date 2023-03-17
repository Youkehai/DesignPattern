package com.ykh.designmodel.facade;

/**
 * 影院灯光
 */
public class TheaterLight {

    private static TheaterLight instance=new TheaterLight();

    public static TheaterLight getInstance(){
        return instance;
    }

    public void open(){
        System.out.println("打开灯光");
    }

    public void close(){
        System.out.println("关闭灯光");
    }

    public void up(){
        System.out.println("灯光调亮");
    }

    public void down(){
        System.out.println("灯光调暗");
    }

}
