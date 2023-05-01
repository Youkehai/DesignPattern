package com.ykh.designmodel.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 信息工程学员
 */
public class InfoCollegeIterator implements Iterator<Department> {

    List<Department> departmentList;

    int index=-1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if(this.index>=departmentList.size()-1){
            return false;
        }
        //下移
        index++;
        return true;
    }

    @Override
    public Department next() {
        return this.departmentList.get(index);
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
