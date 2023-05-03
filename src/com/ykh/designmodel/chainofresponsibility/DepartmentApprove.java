package com.ykh.designmodel.chainofresponsibility;

/**
 * 系处理
 */
public class DepartmentApprove extends Approve{
    public DepartmentApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(Request request) {
        if(request.getMoney()<=5000){
            System.out.println("请求ID："+request.getId()+"被"+this.name+"处理了===");
        }else{
            System.out.println(this.name+"无法处理该请求，换下一个，往下找=====");
            super.nextApprove.processRequest(request);
        }
    }
}
