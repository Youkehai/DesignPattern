package com.ykh.designmodel.flyweight;

/**
 * 享元模式
 *
 * 基本介绍
 * 1)享元模式(Flyweight Pattern)也叫 蝇量模式: 运用共享技术有效地支持大量细粒度的对象
 * 2）常用于系统底层开发，解决系统的性能问题。像数据库连接池，里面都是创建好的连接对象，这些连接对象中有我们需要的则直接拿来用，避免重新创建，如果没有我们需要的，则创建一个
 * 3）享元模式能够解决重复对象的内存浪费的问题当系统中有大量相似对象，需要缓冲池时。不需总是创建新对象，可以从缓冲池里拿。这样可以降低系统内存，同时提高效率
 * 4）享元模式经典的应用场景就是池技术了，string常量池、数据库连接池、缓冲池等等都是享元模式的应用，享元模式是池技术的重要实现方式
 *
 * 角色和职责说明
 * 1)FlyWeight 是抽象的享元角色，他是产品的抽象类，同时定义出对象的外部状态和内部状态(后面介绍)的接口或实现
 * 2)ConcreteFlyWeight 是具体的享元角色，是具体的产品类，实现抽象角色定义相关业务
 * 3)UnSharedConcreteFlyWeight 是不可共享的角色，一般不会出现在享元工厂。
 * 4)FlyWeightFactory 享元工厂类，用于构建一个池容器(集合)，同时提供从池中获取对象方法
 *
 * 内部状态和外部状态解读：
 * 比如围棋、五子棋、跳棋，它们都有大量的棋子对象，围棋和五子棋只有黑白两色，跳棋颜色多点，所以棋子颜色就是棋子的内部状态，
 * 而各个棋子之间的差别就是位置的不同，当我们落子后落子颜色是定的，但位置是变化的，所以棋子坐标就是棋子的外部状态。
 * 1) 享元模式提出了两个要求: 细粒度和共享对象。这里就涉及到内部状态和外部状态了，即将对象的信息分为两个部分: 内部状态和外部状态。
 * 2) 内部状态指对象共享出来的信息，存储在享元对象内部且不会随环境的改变而改变。
 * 3) 外部状态指对象得以依赖的一个标记，是随环境改变而改变的、不可共享的状态。
 * 4）举个例子:围棋理论上有361个空位可以放棋子，每盘棋都有可能有两三百个棋子对象产生，因为内存空间有限，
 * 一台服务器很难支持更多的玩家玩围棋游戏，如果用享元模式来处理棋子，那么棋子对象就可以减少到只有两个实例，这样就很好的解决了对象的开销问题
 */
public class FlyweightTest {

    public static void main(String[] args) {
        //type表示内部状态，user表示外部状态
        //创建一个工厂
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        //现在需要一个新闻形式的网站
        WebSite xw1= webSiteFactory.getWebsiteByCategory("新闻");
        xw1.use(new User().setName("小明"));
        //现在其他客户需要一个博客形式的网站
        WebSite bk1 = webSiteFactory.getWebsiteByCategory("博客");
        bk1.use(new User().setName("小红"));
        //又需要一个博客
        WebSite bk2 = webSiteFactory.getWebsiteByCategory("博客");
        bk2.use(new User().setName("小张"));
        //又需要新闻
        WebSite xw2= webSiteFactory.getWebsiteByCategory("新闻");
        xw2.use(new User().setName("小鸡"));
        System.out.println("现有的网站类型数量："+webSiteFactory.getWebsiteCount());
    }
}
