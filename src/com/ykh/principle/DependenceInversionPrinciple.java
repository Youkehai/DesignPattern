package com.ykh.principle;

/**
 * 依赖倒转原则
 *
 * 依赖倒转原则(Dependence Inversion Principle)是指:
 * 1 高层模块不应该依赖低层模块，二者都应该依赖其抽象
 * 2 抽象不应该依赖细节，细节应该依赖抽象
 * 3 依赖倒转(倒置)的中心思想是面向接口编程
 * 4 依赖倒转原则是基于这样的设计理念: 相对于细节的多变性，抽象的东西要稳定的多。
 *   以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。在java中，抽象指的是接口或抽象类，细节就是具体的实现类
 * 5 使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成
 */
public class DependenceInversionPrinciple {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.receive(new Email()));
        System.out.println(person.receive(new WeChat()));
    }
}

/**
 * 消息接收者
 */
interface IReceiver{
    public String getInfo();
}

class WeChat implements  IReceiver{

    @Override
    public String getInfo() {
        return "微信收到消息";
    }
}

class Email implements  IReceiver{

    @Override
    public String getInfo() {
        return "邮箱收到消息";
    }
}

class Person{
    public String receive(IReceiver msg){
        return msg.getInfo();
    }
}
