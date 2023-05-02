package com.ykh.designmodel.mediator.colleague;

import com.ykh.designmodel.mediator.Mediator;

/**
 * 同事类的抽象层，所有的具体子类需要继承她
 */
public abstract class Colleague {

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }

    /**
     * 中介类
     */
    private Mediator mediator;
    public String name;

    public abstract void sendMessage(int stateChange);
}
