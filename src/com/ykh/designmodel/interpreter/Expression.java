package com.ykh.designmodel.interpreter;

import java.util.Map;

/**
 * 抽象类表达式，通过 var 获取到每个变量的值
 */
public abstract class Expression {

    /**
     * 表达式为:a+b-c,需要计算的为:3+2-1
     * 解释公式和数值
     * @param var key为a,b,c。value为3,2,1,则a->3,b->2,c->1
     * @return
     */
    abstract int interpreter(Map<String,Integer> var);
}
