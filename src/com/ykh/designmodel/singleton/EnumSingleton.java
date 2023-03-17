package com.ykh.designmodel.singleton;

/**
 * 枚举实现单例模式
 * 推荐使用
 */
public class EnumSingleton {
    public static void main(String[] args) {
        EnumSingletonTest instance = EnumSingletonTest.INSTANCE;
        EnumSingletonTest instance2 = EnumSingletonTest.INSTANCE;

        System.out.println(instance.hashCode()==instance2.hashCode());
    }
}

/**
 *
 */
enum EnumSingletonTest {
    INSTANCE;

    public void hello(){
        System.out.println("123");
    }
}