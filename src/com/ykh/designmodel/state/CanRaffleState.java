package com.ykh.designmodel.state;

import java.util.Random;

/**
 * 可以抽奖的状态
 */
public class CanRaffleState extends State {
    /**
     * 活动信息
     */
    RaffleActivity raffleActivity;

    public CanRaffleState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    /**
     * 因为当前已经是可以抽奖的状态了，所以不用扣除积分
     */
    @Override
    void deductMoney() {
        System.out.println("已经扣除过积分了");
    }

    /**
     * 根据是否中将，修改当前状态
     * @return
     */
    @Override
    boolean raffle() {
        Random random = new Random();
        int nextInt = random.nextInt(10);
        if (nextInt == 0) {
            System.out.println("中奖了");
            //改为可以领奖状态
            raffleActivity.setState(raffleActivity.getDispenseState());
        } else {
            System.out.println("没中奖");
            //改为未中奖状态
            raffleActivity.setState(raffleActivity.getNoRaffleState());
        }
        return nextInt == 0;
    }

    /**
     * 当前状态还是抽奖状态，当然不能发放奖品
     */
    @Override
    void dispensePrize() {
        System.out.println("未中奖，不能发奖品");
    }
}
