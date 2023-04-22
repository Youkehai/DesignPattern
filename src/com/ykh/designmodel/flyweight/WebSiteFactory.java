package com.ykh.designmodel.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 网站工厂类
 */
public class WebSiteFactory {

    /**
     * 充当池的作用
     */
    private Map<String,ConcreateWebsite> pool=new HashMap<>();

    /**
     * 根据网站类型，返回网站，如果没有，则创建
     * @param type
     * @return
     */
    public WebSite getWebsiteByCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreateWebsite(type));
        }
        return pool.get(type);
    }

    /**
     * 获取当前容器中有多少个网站
     * @return
     */
    public Integer getWebsiteCount(){
        return this.pool.size();
    }
}
