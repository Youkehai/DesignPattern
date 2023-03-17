package com.ykh.designmodel.decorator;

/**
 * 装饰者模式
 *
 * 动态的将新功能附加到对象上。在对象功能扩展方面，它比继承更有弹性，装饰者模式也体现了开闭原则(ocp)
 * 这里提到的动态的将新功能附加到对象和ocp原则，在后面的应用实例上会以代码的形式体现。
 *
 * 装饰者模式就像打包一个快递
 * 主体: 比如: 陶瓷、衣服(Component) // 被装饰者
 * 包装: 比如: 报纸填充、塑料泡沫、纸板、木板(Decorator)
 *
 * 装饰者模式在JDK中的应用
 * Java的IO结构
 * @see java.io.FilterInputStream 就是一个装饰者
 * public abstract class InputStream implements Closeablef //是一个抽象类，即Component
 * public class FilterlnputStream extends InputStream //是一个装饰者类Decorator
 * protected volatile InputStream in //被装饰的对象
 * class DatalnputStream extends FilterlnputStream implements Datalnput ( //FilterlnputStream ,也继承了被装饰的对象in
 *
 * 1.Inputstream 是抽象类，类似 Drink
 * 2.FileInputStream 是 InputStream 子类，类似 CoffeeChildrenOne,CoffeeChildrenTwo
 * 3.FilterInputStream 是 InputStream 子类: 类似 Decorator 修饰者
 * 4.DataInputStream 是 FilterInputStream 子类，具体的修饰者，类似前面的 Milk，Soy 等
 * 5.FilterInputStream 类有 protected volatile InputStream in; 即含被装饰者
 */
public class Decorator extends Drink{

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    private Drink obj;
    @Override
    public float cost() {
        //getPrice为自己本身的价格
        return super.getPrice()+obj.cost();
    }

    @Override
    public String getDes() {
        //输出被装饰者信息
        return super.getDes()+super.getPrice()+"&&"+obj.getDes();
    }
}
