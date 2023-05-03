package com.ykh.designmodel.state;

/**
 * 状态模式
 *
 * 1.Context 类为环境角色，用于维护State实例这个实例定义当前状态
 * 2.State 是抽象状态角色定义一个接口封装与Context 的一个特点接口相关行为
 * 3.ConcreteState 具体的状态角色，每个子类实现一个与Context 的一个状态相关行为
 */
public class StateTest {

    public static void main(String[] args) {
        RaffleActivity raffleActivity = new RaffleActivity(1);
        //连续抽30次
        for (int i = 0; i < 30; i++) {
            System.out.println("第"+(i+1)+"次抽奖");
            //扣积分
            raffleActivity.debutMoney();
            //抽奖
            raffleActivity.raffle();
        }
    }
}
