package com.ykh.designmodel.template;

/**
 * 最高层抽象类
 */
public abstract class SoybeanMilk {

    /**
     * 定义为final，不准子类覆盖
     */
    final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }

    /**
     * 第一步，选择材料
     */
    void select(){
        System.out.println("第一步，选择最基础原料");
    }

    /**
     * 添加配料，子类实现，具体配料
     */
    abstract void addCondiments();

    /**
     * 浸泡
     */
    void soak(){
        System.out.println("原料和配料一起浸泡中");
    }

    void beat(){
        System.out.println("第四步，打碎，得到豆浆");
    }
}
