package com.ykh.designmodel.proxy.staticproxy;

public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("TeacherDao的tech");
    }
}
