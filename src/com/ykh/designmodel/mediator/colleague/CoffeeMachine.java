package com.ykh.designmodel.mediator.colleague;

import com.ykh.designmodel.mediator.Mediator;

/**
 * 咖啡机
 */
public class CoffeeMachine extends Colleague{

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, "coffeeMachine");
        mediator.register(name,this);
    }

    public void open(){
        System.out.println("打开了咖啡机");
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }
}
