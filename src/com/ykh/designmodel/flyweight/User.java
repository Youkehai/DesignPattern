package com.ykh.designmodel.flyweight;

/**
 * 享元模式的外部状态表示
 */
public class User {

    private String name;


    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }
}
