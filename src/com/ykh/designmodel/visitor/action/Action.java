package com.ykh.designmodel.visitor.action;

import com.ykh.designmodel.visitor.Man;
import com.ykh.designmodel.visitor.Woman;

public abstract class Action {

    /**
     * 得到男性的结果
     */
    public abstract void getManResult(Man man);

    /**
     * 得到女性的结果
     */
    public abstract void getWomanResult(Woman woman);
}
