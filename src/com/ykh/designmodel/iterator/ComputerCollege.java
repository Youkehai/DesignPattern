package com.ykh.designmodel.iterator;

import java.util.Iterator;

/**
 * 计算机学院
 */
public class ComputerCollege implements College{

    /**
     * 系
     */
    Department[] departments;
    /**
     * 第几个
     */
    int index=0;

    public ComputerCollege() {
        departments= new Department[10];
        addDepartment("java语言","java语言");
        addDepartment("c#","c#");
        addDepartment("php","php");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[index]=department;
        index++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
