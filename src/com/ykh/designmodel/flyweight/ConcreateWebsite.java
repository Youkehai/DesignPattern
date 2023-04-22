package com.ykh.designmodel.flyweight;

/**
 * 具体的网站
 */
public class ConcreateWebsite extends WebSite{
    /**
     * 共享部分的内部状态
     */
    private String type;

    public ConcreateWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为："+type+","+user.getName()+"在使用");
    }
}
