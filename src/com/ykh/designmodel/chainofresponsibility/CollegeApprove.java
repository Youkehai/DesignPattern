package com.ykh.designmodel.chainofresponsibility;

/**
 * 学院主任处理
 */
public class CollegeApprove extends Approve{
    public CollegeApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(Request request) {
        if(request.getMoney()>5000 && request.getMoney()<=10000){
            System.out.println("请求ID："+request.getId()+"被"+this.name+"处理了===");
        }else{
            System.out.println(this.name+"无法处理该请求，换下一个，往下找=====");
            super.nextApprove.processRequest(request);
        }
    }
}
