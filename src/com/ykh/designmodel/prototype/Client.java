package com.ykh.designmodel.prototype;

/**
 * 原型模式测试客户端类
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype=new Prototype("小张","黄",10);
        Prototype prototype2 = (Prototype) prototype.clone();
        Prototype prototype3 = (Prototype) prototype.clone();

        System.out.println(prototype);
        System.out.println(prototype2);
        System.out.println(prototype3);
    }
}
