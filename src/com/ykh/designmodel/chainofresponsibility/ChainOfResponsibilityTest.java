package com.ykh.designmodel.chainofresponsibility;

/**
 * 职责链模式
 *
 * 1.Approve:抽象的处理者，定义了一个处理请求的接口，同时含义另外Handler
 * 2.ConcreteApproveA，B 是具体的处理者，处理它自己负责的请求，可以访问它的后维者(即下一个处理者)，如果可以处理当前请求，则处理，
 *   否则就将该请求交个 后继者去处理，从而形成一个职责链
 * 3.Request ，含义很多属性，表示一个请求
 *
 * 在springMvc中用到了职责链模式
 * DispatcherServlet 中的 preHandle 方法
 * 1.springmvc 请求的流程图中，执行了 拦截器相关方法 interceptor.preHandler 等等
 * 2.在处理SpringMvc请求时，使用到职责链模式还用到适配器模式
 * 3.HandlerExecutionChain 主要负责的是请求拦截器的执行和请求处理,但是他本身不处理请求，只是将请求分配给链上注册处理器执行，
 *   这是职责链实现方式,减少职责链本身与处理逻辑之间的耦合,规范了处理流程
 * 4.HandlerExecutionChain 维护了 HandlerInterceptor 的集合， 可以向其中注册相应的拦截器.
 */
public class ChainOfResponsibilityTest {

    public static void main(String[] args) {
        //创建请求
        Request request = new Request(1,12300f,10);
        //创建处理器
        DepartmentApprove departmentApprove = new DepartmentApprove("小主任");
        CollegeApprove collegeApprove = new CollegeApprove("张院长");
        ViceSchoolMasterApprove viceSchoolMasterApprove = new ViceSchoolMasterApprove("李副校长");
        SchoolMasterApprove schoolMasterApprove = new SchoolMasterApprove("游校长");
        //设置处理链
        departmentApprove.setNextApprove(collegeApprove);
        collegeApprove.setNextApprove(viceSchoolMasterApprove);
        viceSchoolMasterApprove.setNextApprove(schoolMasterApprove);

        departmentApprove.processRequest(request);
    }
}
