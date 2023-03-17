package com.ykh.principle;

/**
 * 里氏替换原则
 * <p>
 * 1 里氏替换原则(Liskov Substitution Principle)在1988年，由麻省理工学院的以为姓里的女士提出的。
 * 2 如果对每个类型为T1的对象o1，都有类型为T2的对象o2，使得以T1定义的所有程序P在所有的对象o1都代换成o2时，程序P的行为没有发生变化，那么类型T2是类型T1的子类型。
 * 换句话说，所有引用基类的地方必须能透明地使用其子类的对象。
 * 3 在使用继承时，遵循里氏替换原则，在子类中尽量不要重写父类的方法
 * 4 里氏替换原则告诉我们，继承实际上让两个类耦合性增强了，在适当的情况下，可以通过聚合，组合，依赖来解决问题。
 * <p>
 * 通用的做法是: 原来的父类和子类都继承一个更通俗的基类，原有的继承关系去掉采用依赖，聚合，组合等关系代替.
 */
public class LiskovSubstitution {

    public static void main(String[] args) {
        LiskovA a = new LiskovA();
        System.out.println("11-3=" + a.fun1(11, 3));
        System.out.println("1-8=" + a.fun1(1, 8));
        LiskovB b = new LiskovB();
        System.out.println("11-3=" + b.fun1(11, 3));//这里本意是求出11-3
        System.out.println("1-8=" + b.fun1(1, 8));// 1-8
        System.out.println("11+3+9=" + b.fun2(11, 3));
    }
}

//新加的类，原来是B继承了A，然后B类不小心重写了A类的方法
class Base {
    public int fun1(int a, int b) {
        return a - b;
    }
}

class LiskovA extends Base {

}

class LiskovB extends Base {
    //B和A改为组合关系
    private LiskovA a = new LiskovA();

    public int fun1(int a, int b) {
        return a + b;
    }

    public int fun2(int a, int b) {
        return fun1(a, b) + 9;
    }

    public int fun3(int a, int b) {
        return this.a.fun1(a, b);
    }
}