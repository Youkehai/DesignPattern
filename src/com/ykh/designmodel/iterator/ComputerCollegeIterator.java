package com.ykh.designmodel.iterator;

import java.util.Iterator;

/**
 * 计算机系迭代器
 */
public class ComputerCollegeIterator implements Iterator<Department> {

    /**
     * 被遍历的数据
     */
    Department[] departments;
    /**
     * 当前遍历到的位置
     */
    int index=0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(index>=departments.length || departments[index]==null){
            return false;
        }
        return true;
    }

    @Override
    public Department next() {
        Department department = departments[this.index];
        //后移
        this.index++;
        return department;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
