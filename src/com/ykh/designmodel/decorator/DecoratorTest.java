package com.ykh.designmodel.decorator;

/**
 * 测试装饰者模式
 */
public class DecoratorTest {

    public static void main(String[] args) {

        //装饰者模式下的订单 调味品：2份巧克力+1份牛奶 咖啡:子类1
        //点一份子类咖啡1
        Drink order = new CoffeeChildrenOne();
        System.out.println("价格："+order.cost());
        System.out.println("描述："+order.getDes());
        //加入牛奶
        order=new Milk(order);
        System.out.println("加入牛奶后价格："+order.cost());
        System.out.println("加入牛奶后描述："+order.getDes());
        //加入巧克力
        order=new Chocolate(order);
        System.out.println("加入巧克力后价格："+order.cost());
        System.out.println("加入巧克力后描述："+order.getDes());
        //再加入巧克力
        order=new Chocolate(order);
        System.out.println("加入两份巧克力后价格："+order.cost());
        System.out.println("加入两份巧克力后描述："+order.getDes());
    }
}
