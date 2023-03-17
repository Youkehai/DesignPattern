package com.ykh.designmodel.facade;

/**
 * dvd
 */
public class DvdPlayer {

    private static DvdPlayer instance=new DvdPlayer();

    public static DvdPlayer getInstance(){
        return instance;
    }

    public void open(){
        System.out.println("dvd开机");
    }

    public void close(){
        System.out.println("dvd关机");
    }

    public void play(){
        System.out.println("dvd播放");
    }

    public void pause(){
        System.out.println("dvd暂停");
    }

}
