package com.ykh.designmodel.memento.game;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 守护者对象。保存游戏角色的状态
 */
public class Caretaker {

    /**
     * 保存一次状态
     */
    private Memento memento;
    /**
     * 多份对象数据
     */
    List<Memento> mementos=new ArrayList<>();
    /**
     * 多个角色保存状态
     */
    private HashMap<String,List<Memento>> stringListHashMap=new HashMap<>();

    /**
     * 添加备份
     * @param memento
     */
    public void add(Memento memento){
        mementos.add(memento);
    }

    /**
     * 获取指定的备忘对象
     * @param index 指定下标
     * @return
     */
    public Memento get(int index){
        return mementos.get(index);
    }
}
