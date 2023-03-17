package com.ykh.designmodel.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 无需重写remove和add方法
 * 因为该类时最小类，是叶子节点
 */
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name,des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getTips() {
        return super.getTips();
    }

    /**
     * 输出包含专业
     */
    @Override
    public void print() {
        System.out.println("叶子节点："+getName());
    }
}
