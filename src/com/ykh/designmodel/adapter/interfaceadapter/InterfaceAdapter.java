package com.ykh.designmodel.adapter.interfaceadapter;

/**
 * 接口适配器模式
 *
 * 1.一些书籍称为:适配器模式(Default Adapter Pattern)或缺省适配器模式
 * 2.当不需要全部实现接口提供的方法时，可先设计一个抽象类实现接口，并为该接2口中每个方法提供一个默认实现 (空方法)，那么该抽象类的子类可有选择地覆盖父类的某些方法来实现需求
 * 3。适用于一个接口不想使用其所有的方法的情况。
 */
public class InterfaceAdapter {

    public static void main(String[] args) {
        //只需要重写我们关心的方法
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void method1() {
                System.out.println("重写了M1");
                super.method1();
            }
        };
        absAdapter.method1();
        absAdapter.method2();
    }

}
