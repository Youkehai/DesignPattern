package com.ykh.designmodel.singleton;

/**
 * 懒汉式单例
 * 优点：懒加载
 * 缺点：该写法线程不安全
 * 不推荐
 */
public class LazySingleton1 {

    private static LazySingleton1 instance;

    private LazySingleton1(){}

    /**
     * 懒汉式单例，使用该方法时，才创建该对象，不提前创建
     * 线程不安全懒汉式
     * @return
     */
    public static LazySingleton1 getInstance(){
        if(instance==null){
            instance=new LazySingleton1();
        }
        return instance;
    }
}
