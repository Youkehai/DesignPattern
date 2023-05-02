package com.ykh.designmodel.mediator;

import com.ykh.designmodel.mediator.colleague.Alarm;
import com.ykh.designmodel.mediator.colleague.CoffeeMachine;
import com.ykh.designmodel.mediator.colleague.Colleague;
import com.ykh.designmodel.mediator.colleague.TV;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator extends Mediator{

    /**
     * 所有的同事对象
     */
    Map<String,Colleague> colleagueMap=new HashMap<>();

    @Override
    public void register(String name, Colleague colleague) {
        colleagueMap.put(name,colleague);
    }

    /**
     * 根据得到的消息，完成对应任务
     * 中介者得到方法后，协调各个具体的类，完成任务
     * @param stateChange
     * @param name
     */
    @Override
    public void getMessage(int stateChange, String name) {
        Colleague colleague = colleagueMap.get(name);
        //在此写很多业务逻辑，例如现在这个，如果闹钟打开了，那么咖啡机同步打开
        //还会有很多逻辑，例如：电视机打开，空调打开，灯关关闭，窗帘拉下等等等，将上述例子的所有业务代码写在某一个方法中，但是具体的打开电视
        //打开空调，需要调用具体的TV类和空调类
        if(colleague instanceof Alarm){
            //拿到咖啡机
            CoffeeMachine coffeeMachine= (CoffeeMachine) colleagueMap.get("coffeeMachine");
            //打开咖啡机
            coffeeMachine.open();
        }else if(colleague instanceof CoffeeMachine){
            //打开
            if(stateChange==0){

            }else if(stateChange==1){
                //关闭
            }
        }else if(colleague instanceof TV){
            //打开
            if(stateChange==0){

            }else if(stateChange==1){
                //关闭
            }
        }
    }
}
