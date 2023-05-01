package com.ykh.designmodel.iterator;

import java.util.Iterator;

/**
 * 学院接口
 */
public interface College {

    /**
     * 返回学院名称
     * @return
     */
    public String getName();

    /**
     * 增加系
     * @param name
     * @param desc
     */
    public void addDepartment(String name,String desc);

    /**
     * 创建迭代器
     * @return
     */
    public Iterator createIterator();
}
