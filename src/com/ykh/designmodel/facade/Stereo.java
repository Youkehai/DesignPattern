package com.ykh.designmodel.facade;

/**
 * 立体声
 */
public class Stereo {

    private static Stereo instance=new Stereo();

    public static Stereo getInstance(){
        return instance;
    }

    public void open(){
        System.out.println("关闭立体音响");
    }

    public void close(){
        System.out.println("打开立体音响");
    }

    public void up(){
        System.out.println("声音调大");
    }


}
