package com.ykh.designmodel.flyweight;

/**
 * 网站抽象类
 */
public abstract class WebSite {

    /**
     *
     * @param user 外部状态，表示谁在使用
     */
    public abstract void use(User user);
}
