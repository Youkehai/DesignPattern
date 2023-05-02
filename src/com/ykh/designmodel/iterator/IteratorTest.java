package com.ykh.designmodel.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式
 *
 * 迭代器模式在{@link ArrayList#iterator()}中应用
 * 1.内部类{@link ArrayList.Itr}充当具体的Iterator类
 * 2.{@link List}充当了聚合接口，含有iterator()方法，返回迭代器对象
 * 3.{@link ArrayList}实现了聚合接口List
 * 迭代器模式解决了不同集合（数组，链表等），统一遍历的问题
 */
public class IteratorTest {

    public static void main(String[] args) {
        //创建学院
        List<College> collegeList=new ArrayList<>();
        collegeList.add(new ComputerCollege());
        collegeList.add(new InfoCollege());
        //输出
        OutputImpl output = new OutputImpl(collegeList);
        output.printCollege();
    }
}
