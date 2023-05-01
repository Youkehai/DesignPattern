package com.ykh.designmodel.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 使用cglib代理
 * 实现 MethodInterceptor 接口
 */
public class ProxyFactory implements MethodInterceptor {

    /**
     * 目标代理对象
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 通过cglib代理
     * 获取 target 的代理对象
     * @return
     */
    public Object getProxyInstance(){
        //使用cglib创建一个工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象，及代理对象
        return enhancer.create();
    }

    /**
     * 重写cglib的 MethodInterceptor 中的 intercept方法
     * 会调用 target对象的方法
     * @param o
     * @param method
     * @param args
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理模式开始");
        Object result = method.invoke(target, args);
        System.out.println("cglib对象结束");
        return result;
    }
}
