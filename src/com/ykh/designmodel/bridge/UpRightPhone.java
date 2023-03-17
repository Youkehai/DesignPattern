package com.ykh.designmodel.bridge;

/**
 * 直屏手机样式
 * 手机调用方法，使用的是父类中聚合的Brand中具体实现类的方法
 */
public class UpRightPhone extends Phone{
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("直屏手机打开");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("直屏手机管理");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直屏手机打电话");
    }
}
