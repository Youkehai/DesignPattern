package com.ykh.designmodel.proxy.cglib;

import com.ykh.designmodel.proxy.dynamicproxy.ITeacherDao;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("TeacherDao的cglib代理的tech");
    }
}
