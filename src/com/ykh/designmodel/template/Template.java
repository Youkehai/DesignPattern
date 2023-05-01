package com.ykh.designmodel.template;

import com.ykh.designmodel.template.pro.PureSoybeanMilk;

/**
 * 模板方法模式的钩子方法
 * 在模板方法模式的父类中，我们可以定义一个方法，它默认不做任何事，子类可以视情况要不要覆盖它，该方法称为“钩子”
 * 还是用上面做豆浆的例子来讲解，比如，我们还希望制作纯豆浆，不添加任何的配料，使用钩子方法对前面的模板力法进行改造
 *
 *
 */
public class Template {

    public static void main(String[] args) {
        System.out.println("红豆豆浆");
        SoybeanMilk reaBeanSoybeanMilk = new ReaBeanSoybeanMilk();
        reaBeanSoybeanMilk.make();
        System.out.println("花生豆浆");
        SoybeanMilk peanutSoybeanMilk = new PeanutSoybeanMilk();
        peanutSoybeanMilk.make();
        System.out.println("纯豆浆");
        com.ykh.designmodel.template.pro.SoybeanMilk pureSoybeanMilk = new PureSoybeanMilk();
        pureSoybeanMilk.make();
    }
}
