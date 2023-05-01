package com.ykh.designmodel.proxy.dynamicproxy;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("TeacherDao的tech");
    }
}
