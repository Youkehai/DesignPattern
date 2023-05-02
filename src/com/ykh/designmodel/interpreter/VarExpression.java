package com.ykh.designmodel.interpreter;

import java.util.Map;

/**
 * 变量解析器
 */
public class VarExpression extends Expression{

    /**
     * key为 a,b,c这种
     */
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    /**
     * 根据变量名称，返回对应的值
     * @param var key为a,b,c。value为3,2,1,则a->3,b->2,c->1
     * @return
     */
    @Override
    int interpreter(Map<String, Integer> var) {
        return var.get(this.key);
    }
}
