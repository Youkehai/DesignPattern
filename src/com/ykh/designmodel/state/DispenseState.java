package com.ykh.designmodel.state;

/**
 * 发放奖品的状态
 */
public class DispenseState extends State{
    /**
     * 活动信息
     */
    RaffleActivity raffleActivity;

    public DispenseState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    void deductMoney() {
        System.out.println("不能扣除积分，当前为已中奖状态");
    }

    @Override
    boolean raffle() {
        System.out.println("不能抽奖，当前为已中奖状态");
        return false;
    }

    @Override
    void dispensePrize() {
        if(raffleActivity.getCount()>0){
            System.out.println("恭喜中奖，马上发奖品");
            raffleActivity.setState(raffleActivity.getNoRaffleState());
        }else{
            System.out.println("奖品没了，中奖也没用");
            raffleActivity.setState(raffleActivity.getDispenseOutState());
            System.out.println("积分还给你===");
        }
    }
}
