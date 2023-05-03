package com.ykh.designmodel.state;

/**
 * 不能抽奖的状态
 */
public class NoRaffleState extends State{

    /**
     * 活动信息
     */
    RaffleActivity raffleActivity;

    /**
     * 构造器时初始化活动的信息
     * @param raffleActivity
     */
    public NoRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    /**
     * 当前状态会扣积分，扣除后，将状态设置为可以抽奖的状态
     */
    @Override
    void deductMoney() {
        System.out.println("扣除了五十分，可以抽奖了");
        raffleActivity.setState(raffleActivity.getCanRaffleState());
    }

    /**
     * 目前是不能抽奖状态，所以直接返回false
     * @return
     */
    @Override
    boolean raffle() {
        System.out.println("扣了积分才能抽奖");
        return false;
    }

    /**
     * 当前状态不能发奖品
     */
    @Override
    void dispensePrize() {
        System.out.println("当前状态不能发放奖品");
    }
}
