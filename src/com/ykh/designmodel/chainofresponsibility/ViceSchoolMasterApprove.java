package com.ykh.designmodel.chainofresponsibility;

/**
 * 副校长处理
 */
public class ViceSchoolMasterApprove extends Approve{
    public ViceSchoolMasterApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(Request request) {
        if(request.getMoney()>10000 && request.getMoney()<=30000){
            System.out.println("请求ID："+request.getId()+"被"+this.name+"处理了===");
        }else{
            System.out.println(this.name+"无法处理该请求，换下一个，往下找=====");
            super.nextApprove.processRequest(request);
        }
    }
}
