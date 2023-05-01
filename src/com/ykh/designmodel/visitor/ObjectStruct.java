package com.ykh.designmodel.visitor;


import com.ykh.designmodel.visitor.action.Action;

import java.util.LinkedList;
import java.util.List;

public class ObjectStruct {
    private List<Person> personList=new LinkedList<>();

    public void attach(Person person){
        personList.add(person);
    }

    public void detach(Person person){
        personList.remove(person);
    }

    /**
     * 显示结果
     * @param action
     */
    public void display(Action action){
        for (Person person : personList) {
            person.accept(action);
        }
    }
}
