package com.ykh.designmodel.template;

import com.ykh.designmodel.template.pro.PureSoybeanMilk;

/**
 * 模板方法模式的钩子方法
 * 在模板方法模式的父类中，我们可以定义一个方法，它默认不做任何事，子类可以视情况要不要覆盖它，该方法称为“钩子”
 * 还是用上面做豆浆的例子来讲解，比如，我们还希望制作纯豆浆，不添加任何的配料，使用钩子方法对前面的模板力法进行改造
 *
 *模板方法模式的注意事项和细节
 * 1。 基本思想是:算法只存在于一个地方，也就是在父类中，容易修改。需要修改算法时，只要修改父类的模板方法或者已经实现的某些步骤，子类就会继承这些修改
 * 2. 实现了最大化代码复用。父类的模板方法和已实现的某些步骤会被子类继承而直接使用。
 * 3. 既统一了算法，也提供了很大的灵活性。父类的模板方法确保了算法的结构保持不变，同时由子类提供部分步骤的实现。
 * 4. 该模式的不足之处:每一个不同的实现都需要一个子类实现，导致类的个数增加,使得系统更加庞大
 * 5. 一般模板方法都加上final关键字， 防止子类重写模板方法
 * 6. 模板方法模式使用场景:当要完成在某个过程，该过程要执行一系列步骤，这一系列的步骤基本相同，但其个别步骤在实现时 可能不同，通常考虑用模板方法模式来处理
 */
public class TemplateTest {

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
