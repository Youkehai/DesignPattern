package com.ykh.designmodel.chainofresponsibility;

/**
 * 请求数据
 */
public class Request {
    /**
     * 请求类型
     */
    private int type;

    /**
     * 金额
     */
    private float money;

    private int id;

    public Request(int type,float money, int id) {
        this.type = type;
        this.money = money;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public float getMoney() {
        return money;
    }

    public int getId() {
        return id;
    }
}
