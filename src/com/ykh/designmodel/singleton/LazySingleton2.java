package com.ykh.designmodel.singleton;

/**
 * 线程安全的懒汉式
 * 不推荐
 */
public class LazySingleton2 {
    private static LazySingleton2 instance;

    private LazySingleton2(){}

    /**
     * 懒汉式单例，使用该方法时，才创建该对象，不提前创建
     * 加入同步处理，但是getInstance整个方法加上了同步，相当于只要被获取就会阻塞，下面看LazySingleton3
     * @return
     */
    public static synchronized LazySingleton2 getInstance(){
        if(instance==null){
            instance=new LazySingleton2();
        }
        return instance;
    }
}
