package com.ykh.designmodel.interpreter;

import java.util.Map;

/**
 * 符号解析器
 * 每个符号，只会和左右两个数字有关系，但是左右两个数字可能也是一个解析结果，所以都是 Expression 的实现类
 *
 */
public class SymbolExpression extends Expression{

    /**
     * 该符号，左右的数字或表达式结果
     */
    protected Expression left;

    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * SymbolExpression为抽象类，子类会重写该方法，因此此处不实现
     * @param var key为a,b,c。value为3,2,1,则a->3,b->2,c->1
     * @return
     */
    @Override
    int interpreter(Map<String, Integer> var) {
        return 0;
    }
}
