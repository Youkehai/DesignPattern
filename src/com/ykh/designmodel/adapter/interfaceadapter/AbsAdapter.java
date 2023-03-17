package com.ykh.designmodel.adapter.interfaceadapter;

/**
 * 将TestInterface中的方法全部进行默认实现
 */
public abstract class AbsAdapter implements TestInterface{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {
        System.out.println("m2没被重写");
    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }
}
