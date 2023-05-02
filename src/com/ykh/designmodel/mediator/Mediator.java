package com.ykh.designmodel.mediator;

import com.ykh.designmodel.mediator.colleague.Colleague;

/**
 * 中介者抽象类
 */
public abstract class Mediator {

    /**
     * 注册同事
     * @param name
     * @param colleague
     */
   public abstract void  register(String name, Colleague colleague);

    /**
     * 接受消息，具体的同事对象发出
     * @param stateChange
     * @param name
     */
   public  abstract void getMessage(int stateChange,String name);
}
