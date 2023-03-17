package com.ykh.designmodel.facade;

/**
 * 爆米花机
 */
public class Popcorn {

    private static Popcorn instance=new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }

    public void open(){
        System.out.println("爆米花机开机");
    }

    public void close(){
        System.out.println("爆米花机关机");
    }

    public void play(){
        System.out.println("爆米花机生产爆米花");
    }

    public void pause(){
        System.out.println("爆米花机暂停");
    }

}
