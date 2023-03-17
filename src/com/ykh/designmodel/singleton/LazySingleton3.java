package com.ykh.designmodel.singleton;

/**
 * 双重检查的懒汉式
 * 推荐使用
 */
public class LazySingleton3 {
    private static volatile LazySingleton3 instance;

    private LazySingleton3() {
    }

    /**
     * 懒汉式单例，使用该方法时，才创建该对象，不提前创建
     * 加入同步处理，锁住代码块，不锁住整个方法
     * 使用双重检查对象是否为空
     * @return
     */
    public static synchronized LazySingleton3 getInstance() {
        if (instance == null) {
            synchronized (LazySingleton3.class) {
                //第二次检测
                if(instance==null){
                    instance = new LazySingleton3();
                }
            }
        }
        return instance;
    }
}
