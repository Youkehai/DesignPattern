package com.ykh.designmodel.state;

/**
 * 状态抽象类
 */
public abstract class State {
    /**
     * 扣除积分
     */
    abstract void deductMoney();

    /**
     * 是否抽中奖品
     * @return
     */
    abstract boolean raffle();

    /**
     * 发放奖品
     */
    abstract void dispensePrize();

}
