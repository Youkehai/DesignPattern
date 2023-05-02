package com.ykh.designmodel.mediator;

import com.ykh.designmodel.mediator.colleague.Alarm;
import com.ykh.designmodel.mediator.colleague.CoffeeMachine;
import com.ykh.designmodel.mediator.colleague.TV;

/**
 * 中介者模式
 *
 * 中介者模式-智能家庭的操作流程
 * 1.创建 ConcreteMediator 对象
 * 2.创建各个同事类对象，比如: Alarm 、CoffeeMachine、TV...
 * 3.在创建同事类对象的时候，就直接通过构造器，加入到colleagueMap
 * 4.同事类对象，可以调用sendMessage，最终会去调用ConcreteMediator的getMessage方法
 * 5.getMessage 会根据接收到的同事对急发出的消息来协调调用其它的同事对象,充成任务
 * 6.可以看到getMessage 是核心方法，亮成相应任务
 * 同步观看方法注释：{@link ConcreteMediator#getMessage}
 */
public class MediatorTest {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        //创建家具类
        Alarm alarm = new Alarm(mediator, "alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
        TV tv = new TV(mediator, "tv");
        alarm.sendAlarm(0);
    }
}
