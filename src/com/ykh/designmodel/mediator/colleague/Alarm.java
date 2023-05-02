package com.ykh.designmodel.mediator.colleague;

import com.ykh.designmodel.mediator.Mediator;

/**
 * 闹钟类
 */
public class Alarm extends Colleague{

    /**
     * 构建时，将自己注册
     * @param mediator
     * @param name
     */
    public Alarm(Mediator mediator, String name) {
        super(mediator, "alarm");
        mediator.register(name,this);
    }

    public void sendAlarm(int stateChange){
        System.out.println("打开了闹钟");
        this.sendMessage(stateChange);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }
}
