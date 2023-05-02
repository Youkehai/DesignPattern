package com.ykh.designmodel.interpreter;

import java.util.Map;

/**
 * 加法解释器
 */
public class AddExpression extends SymbolExpression{
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 重写父类的方法，此处为加法
     * @param var key为a,b,c。value为3,2,1,则a->3,b->2,c->1
     * @return
     */
    @Override
    int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var)+super.right.interpreter(var);
    }
}
