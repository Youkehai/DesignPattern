package com.ykh.designmodel.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * 计算表达式
 */
public class Calculator {
    /**
     * 定义本次的表达式
     */
    private Expression expression;

    /**
     * 构造函数就传入表达式
     *
     * @param expStr
     */
    public Calculator(String expStr) {
        //解析表达式
        //用栈存放，先后顺序
        Stack<Expression> expressionStack = new Stack<>();
        char[] chars = expStr.toCharArray();

        Expression left;
        Expression right;
        //遍历字符，对加法，减法，数字进行处理
        for (int i = 0, len = chars.length; i < len; i++) {
            switch (chars[i]) {
                case '+':
                    //如果是加符号，先取出左边的变量
                    left = expressionStack.pop();
                    //然后取出右边的变量
                    right = new VarExpression(String.valueOf(chars[++i]));
                    //再将结果压入栈
                    expressionStack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = expressionStack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    expressionStack.push(new SubExpression(left, right));
                    break;
                default:
                    //不是符号，则创建 VarExpression 放入栈中
                    expressionStack.push(new VarExpression(String.valueOf(chars[i])));
                    break;
            }
        }
        //遍历完表达式后，栈中得到最后的expression
        this.expression=expressionStack.pop();
    }

    /**
     * 计算结果
     * @param var
     * @return
     */
    public int run(HashMap<String,Integer> var){
        return this.expression.interpreter(var);
    }
}
