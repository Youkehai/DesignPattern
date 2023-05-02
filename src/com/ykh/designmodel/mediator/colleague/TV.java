package com.ykh.designmodel.mediator.colleague;

import com.ykh.designmodel.mediator.Mediator;

public class TV extends Colleague{

    public TV(Mediator mediator, String name) {
        super(mediator, "tv");
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }
}
