package com.ykh.designmodel.proxy.dynamicproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    /**
     * 目标代理对象
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 给目标对象，生成代理对象
     * @return
     */
    public Object getProxyInstance(){
        /**
         * public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h)
         *
         *   1.ClassLoader loader 表示当前目标对象要使用的类加载器
         *   2.Class<?>[] interfaces 被代理对象实现的接口，使用泛型
         *   3.InvocationHandler h 事件处理，执行目标对象的方法时，会触发该事件处理器，会将当前执行的目标对象的方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("开始JDK代理");
                    //使用反射调用目标对象的方法
                    Object result = method.invoke(target, args);
                    System.out.println("JDK代理结束");
                    return result;
                });
    }
}
