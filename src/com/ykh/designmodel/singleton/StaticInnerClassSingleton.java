package com.ykh.designmodel.singleton;

/**
 * 静态内部类实现单例
 * 既可以达到懒加载效果，也可以保证线程安全
 * 静态内部类只有在当前类被创建时，才会被创建，所以可以直接实现懒加载
 * 而且使用类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){}

    /**
     * 使用静态内部类，初始化时创建StaticInnerClassSingleton
     */
    private static class SingletonInstance{
        private static final StaticInnerClassSingleton instance=new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return SingletonInstance.instance;
    }
}
