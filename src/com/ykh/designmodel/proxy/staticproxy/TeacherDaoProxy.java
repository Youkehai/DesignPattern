package com.ykh.designmodel.proxy.staticproxy;

/**
 * 静态代理
 * {@link TeacherDao 的代理对象}
 */
public class TeacherDaoProxy implements ITeacherDao{

    /**
     * 被代理的目标对象，通过接口来聚合
     */
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        //可以在该方法的前后进行不同的处理，类似于环绕通知
        System.out.println("代理对象的tech开始");
        target.teach();
        System.out.println("代理对象的tech结束");
    }
}
