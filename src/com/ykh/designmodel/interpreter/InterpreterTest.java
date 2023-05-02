package com.ykh.designmodel.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 解释器模式
 *
 * 解释器模式角色说明
 * 1.Context:是环境角色含有解释器之外的全局信息
 * 2.AbstractExpression: 抽象表达式，声明一个抽象的解释操作，这个方法为抽象语法树中所有的节点所共享
 * 3.TerminalExpression:为终结符表达式，实现与文法中的终结符相关的解释操作
 * 4.NonTerminalExpression:为非终结符表达式，为文法中的非终结符实现解释操作
 * 5.说明: Context 和 TerminalExpression 信息通过Client 输入即可
 */
public class InterpreterTest {

    public static void main(String[] args) throws IOException {
        String expStr=getExpStr();
        HashMap<String, Integer> integerHashMap = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        int result = calculator.run(integerHashMap);
        System.out.println("运算结果:"+expStr+"="+result);
    }

    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    /**
     * 这里只处理加和减符号了
     * @param expStr
     * @return
     */
    public static HashMap<String,Integer> getValue(String expStr) throws IOException {
        HashMap<String,Integer> result = new HashMap<>();
        for (char c : expStr.toCharArray()) {
            if(c!='+' && c!='-'){
                if(!result.containsKey(String.valueOf(c))){
                    System.out.println("请输入"+c+"的值：");
                    String in=(new BufferedReader(new InputStreamReader(System.in)).readLine());
                    result.put(String.valueOf(c),Integer.valueOf(in));
                }
            }
        }
        return result;
    }
}
