package com.ykh.designmodel.bridge;

/**
 * 桥接模式
 *
 * 基本介绍
 *
 * 1.桥接模式(Bridge模式)是指: 将实现与抽象放在两个不同的类层次中，使两个层次可以独立改变。
 * 2.是一种结构型设计模式
 * 3.Bridge模式基于类的最小设计原则，通过使用封装、聚合及继承等行为让不同的类承担不同的职责。它的主要特点是把抽象(Abstraction)与行为实现(lmplementation)分离开来，
 *   从而可以保持各部分的独立性以及应对他们的功能扩展 *
 *
 * 桥接模式在JDBC的源码剖析
 *
 *   1) Jdbc 的 Driver接口，如果从桥接模式来看，Driver就是一个接口，下面可以有MySQL的Driver，Oracle的Driver，这些就可以当做实现接口类
 *   2）代码分析+Debug源码
 *   MysQL有自己的ConnectionImpl类，同样oracle也有对应的实现类
 *   Driver和connection之间是通过DriverManager类进行桥连接的
 */
public class BridgeTest {

    public static void main(String[] args) {
        //获取折叠屏小米手机
        Phone folderXiaoMiPhone = new FolderPhone(new XiaoMi());
        //获取折叠屏vivo手机
        Phone folderVivoPhone = new FolderPhone(new Vivo());
        folderXiaoMiPhone.open();
        folderXiaoMiPhone.call();
        folderXiaoMiPhone.close();
        System.out.println("======================");
        folderVivoPhone.open();
        folderVivoPhone.call();
        folderVivoPhone.close();
        System.out.println("直屏手机====================");
        //获取直屏小米手机
        Phone upRightXiaoMiPhone = new UpRightPhone(new XiaoMi());
        //获取直屏vivo手机
        Phone upRightVivoPhone = new UpRightPhone(new Vivo());
        upRightXiaoMiPhone.open();
        upRightXiaoMiPhone.call();
        upRightXiaoMiPhone.close();
        System.out.println("======================");
        upRightVivoPhone.open();
        upRightVivoPhone.call();
        upRightVivoPhone.close();

    }
}
