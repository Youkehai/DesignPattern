package com.ykh.designmodel.composite;

public abstract class OrganizationComponent {
    /**名字*/
    private String name;
    /**方法*/
    private String tips;

    public OrganizationComponent(String name, String tips) {
        this.name = name;
        this.tips = tips;
    }

    /**默认实现，因为有的子类不需要实现该方法*/
    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException("不支持新增操作");
    }

    /**默认实现，因为有的子类不需要实现该方法*/
    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }
    /**所有子类都必须实现*/
    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }
}
