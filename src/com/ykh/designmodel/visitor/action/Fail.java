package com.ykh.designmodel.visitor.action;

import com.ykh.designmodel.visitor.Man;
import com.ykh.designmodel.visitor.Woman;

public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人的失败结果");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人的失败结果");
    }
}
