package com.ykh.designmodel.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备份集合
 */
public class Caretaker {

    /**
     * 多份备忘录数据
     */
    List<Memento> mementos=new ArrayList<>();

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
