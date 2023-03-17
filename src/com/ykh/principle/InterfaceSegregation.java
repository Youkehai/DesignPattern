package com.ykh.principle;

/**
 * 接口隔离原则
 * 客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上
 *
 * 类A通过接口 Interface1依赖类 B，类C 通过接口 Interface1 依赖类 D，如果接口 I1 对于类A 和类C来说不是最小接口，那么类 B 和类D 必须去实现他们不需要的方法。
 * 按隔离原则应当这样处理:
 * 将接口 I1 拆分为独立的几个接口，类A 和类C 分别与他们需要的接口建立依赖关系。也就是采用接口隔离原则
 */
public class InterfaceSegregation {

    public static void main(String[] args) {
        A a = new A();
        //A通过B类去依赖接口
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }
}

interface I1 {
    void operation1();
}

interface I2 {
    void operation2();

    void operation3();
}

interface I3 {
    void operation4();

    void operation5();
}

class A {//A 类通过接口Interface1,Interface2 依赖(使用) B类，但是只会用到1,2,3方法
    public void depend1(I1 i) {
        i.operation1();
    }

    public void depend2(I2 i) {
        i.operation2();
    }

    public void depend3(I2 i) {
        i.operation3();
    }
}

class B implements I1, I2 {

    @Override
    public void operation1() {
        System.out.println("B -- o1");
    }

    @Override
    public void operation2() {
        System.out.println("B -- o2");
    }

    @Override
    public void operation3() {
        System.out.println("B -- o3");
    }
}

class C {//C 类通过接口Interface1,Interface3 依赖(使用) D类，但是只会用到1,4,5方法

    public void depend1(I1 i) {
        i.operation1();
    }

    public void depend4(I3 i) {
        i.operation4();
    }

    public void depend5(I3 i) {
        i.operation5();
    }
}

class D implements I1, I3 {

    @Override
    public void operation1() {
        System.out.println("D -- o1");
    }

    @Override
    public void operation4() {
        System.out.println("D -- o4");
    }

    @Override
    public void operation5() {
        System.out.println("D -- o5");
    }
}
