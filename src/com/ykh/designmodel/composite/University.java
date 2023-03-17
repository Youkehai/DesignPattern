package com.ykh.designmodel.composite;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent {

    //聚合
    List<OrganizationComponent> organizationComponents=new ArrayList<>();

    public University(String name,String des) {
        super(name,des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
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
     * 输出包含学院
     */
    @Override
    public void print() {
        System.out.println(getName()+"包含的学院为：");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            System.out.println(organizationComponent.getName());
        }
    }
}
