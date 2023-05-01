package com.ykh.designmodel.visitor;

import com.ykh.designmodel.visitor.action.Action;

public abstract class Person {

    /**
     *
     * @param action
     */
    abstract void accept(Action action);
}
