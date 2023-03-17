package com.ykh.designmodel.factory.factorymethod.pizza;

/**
 * 抽象披萨父类
 */
public abstract class Pizza {
    protected String name;

    /**
     * 准备阶段,抽象方法，交给子类去实现
     */
    public abstract void prepare();

    /**
     * 烘焙
     */
    public void bake(){
        System.out.println(name+"烘焙中");
    }
    /**
     * 切割装盘
     */
    public void cut(){
        System.out.println(name+"切割装盘");
    }

    /**
     * 打包
     */
    public void box(){
        System.out.println(name+"打包");
    }
}
