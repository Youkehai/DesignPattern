package com.ykh.designmodel.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 输出
 */
public class OutputImpl {
    //学院集合
    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    /**
     * 遍历学院
     */
    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College next = iterator.next();
            System.out.println("学院名称=========："+next.getName()+"============");
            printDepartment(next.createIterator());
        }
    }

    public void printDepartment(Iterator<Department> iterator){
        while (iterator.hasNext()){
            Department next = iterator.next();
            System.out.println(next);
        }
    }
}
