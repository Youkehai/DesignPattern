package com.ykh.designmodel.state;

/**
 * 奖品已发放完成
 */
public class DispenseOutState extends State{
    /**
     * 活动信息
     */
    RaffleActivity raffleActivity;

    public DispenseOutState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    void deductMoney() {
        System.out.println("不能扣除积分，当前为发奖完成");
        System.out.println("积分还给你===");
    }

    @Override
    boolean raffle() {
        System.out.println("不能抽奖，当前为发奖完成");
        System.out.println("积分还给你===");
        return false;
    }

    @Override
    void dispensePrize() {
        System.out.println("不能发奖品，当前为发奖完成");
    }
}
