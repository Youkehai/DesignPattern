package com.ykh.designmodel.visitor.action;

import com.ykh.designmodel.visitor.Man;
import com.ykh.designmodel.visitor.Woman;

public class Wait extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价为待定");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价为待定");
    }
}
