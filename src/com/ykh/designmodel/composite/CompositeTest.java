package com.ykh.designmodel.composite;

/**
 * 组合模式
 *
 * 1.组合模式(Composite Pattern)，又叫部分整体模式，它创建了对象组的树形结构，将对象组合成树状结构以表示“整体-部分”的层次关系。
 * 2.组合模式依据树形结构来组合对象，用来表示部分以及整体层次。
 * 3.这种类型的设计模式属于结构型模式。
 * 4.组合模式使得用户对单个对象和组合对象的访问具有一致性，即:组合能让客4)户以一致的方式处理个别对象以及组合对象
 *
 * 对原理结构图的说明-即(组合模式的角色及职责)
 * 1.Component:这是组合中对象声明接口，在适当情况下，实现所有类共有的接口默认行为,用于访问和管理 Component 子部件，Component 可以是抽象类或者接口
 * 2.Leaf :在组合中表示叶子节点，叶子节点没有子节点
 * 3.Composite :非叶子节点，用于存储子部件，在 Component 接口中实现 子部件的相关操作，比如增加(add)，删除。。
 *
 * 组合模式在JDK源码应用
 * @see java.util.HashMap
 * 1.Map 就是一个抽象的构建 (类似我们的Component(OrganizationComponent))
 *       @see OrganizationComponent
 * 2.HashMap是一个中间的构建(Composite)，实现/继承了相关方法//put, putall，类似university,college
 *   @see University
 *   @see College
 *  * 3.Node 是 HashMap的静态内部类，类似Leaf叶子节点，这里就没有put，putall,类似于Department
 *   static class Node<K,V> implements Map.Entry<K,V>
 *   @see Department
 */
public class CompositeTest {

    public static void main(String[] args) {
        //从大到小创建对象
        //创建大学
        University university = new University("北京大学", "好大学");
        //创建学院
        College code = new College("计算机工程学院", "码农");
        College bzg = new College("土木工程学院", "搬砖工");

        //创建专业
        Department software = new Department("软件工程", "还可以");
        Department compute = new Department("计算机科学与技术", "老牌专业");
        Department see = new Department("勘测", "勘测1");
        Department road = new Department("道路桥梁", "还可以");

        //讲专业加入学院
        code.add(software);
        code.add(compute);
        bzg.add(see);
        bzg.add(road);
        //将学院加入大学
        university.add(code);
        university.add(bzg);

        university.print();
        code.print();
        bzg.print();
        software.print();
    }
}
