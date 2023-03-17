package com.ykh.designmodel.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {

    //聚合学院下的专业
    List<OrganizationComponent> organizationComponents=new ArrayList<>();

    public College(String name, String des) {
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
     * 输出包含专业
     */
    @Override
    public void print() {
        System.out.println(getName()+"包含的专业为：");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            System.out.println(organizationComponent.getName());
        }
    }
}
