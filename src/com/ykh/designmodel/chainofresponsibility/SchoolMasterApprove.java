package com.ykh.designmodel.chainofresponsibility;

public class SchoolMasterApprove extends Approve{
    public SchoolMasterApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(Request request) {
        if(request.getMoney()>30000){
            System.out.println("请求ID："+request.getId()+"被"+this.name+"处理了===");
        }else{
            System.out.println(this.name+"无法处理该请求，此处已经是终点，处理不了，拜拜~~~");
        }
    }
}
