package com.ykh.designmodel.visitor;

import com.ykh.designmodel.visitor.action.Action;

public class Man  extends Person{

    @Override
    void accept(Action action) {
        action.getManResult(this);
    }
}
