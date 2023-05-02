package com.ykh.designmodel.proxy.dynamicproxy;

/**
 * 动态代理模式的基本介绍
 * 1. 代理对象,不需要实现接口，但是目标对象要实现接口，否则不能用动态代理
 * 2. 代理对象的生成，是利用JDK的API，动态的在内存中构建代理对象
 * 3. 动态代理也叫做: JDK代理、接口代理
 * JDK中生成代理对象的API
 * 1. 代理类所在包:java.lang.reflect.Proxy
 * 2. JDK实现代理只需要使用 newProxyInstance 方法,但是该方法需要接收三个参数完整的写法是:
 *    static Object newProxyInstance(ClassLoader loader, Class<?>[interfaces,InvocationHandler h)
 */
public class DynamicProxyITest {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao target = new TeacherDao();
        //获取被代理对象,强制转换为 ITeacherDao
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        //被代理对象：com.ykh.designmodel.proxy.dynamicproxy.TeacherDao@682a0b20
//        System.out.println(proxyInstance);
        proxyInstance.teach();
        //打印出来的为代理对象：class com.sun.proxy.$Proxy0 为内存中动态生成的代理对象
        System.out.println(proxyInstance.getClass());
    }
}
