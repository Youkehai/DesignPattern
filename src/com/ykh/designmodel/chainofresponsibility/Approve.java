package com.ykh.designmodel.chainofresponsibility;

/**
 * 处理请求的抽象类
 */
public abstract class Approve {

    /**
     * 下一个处理者
     */
    Approve nextApprove;
    /**
     * 处理器名称
     */
    String name;

    public Approve(String name) {
        this.name = name;
    }

    public void setNextApprove(Approve nextApprove) {
        this.nextApprove = nextApprove;
    }

    /**
     * 处理请求
     *
     * @param request
     */
    public abstract void processRequest(Request request);
}
