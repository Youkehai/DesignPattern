package com.ykh.designmodel.state;

public class RaffleActivity {

    /**
     * 当前状态
     */
    State state;
    /**
     * 不能抽奖的状态
     */
    State noRaffleState =new NoRaffleState(this);
    /**
     * 能抽奖的状态
     */
    State canRaffleState =new CanRaffleState(this);
    /**
     * 奖品已发完
     */
    State dispenseOutState =new DispenseOutState(this);
    /**
     * 已中奖，发奖品中
     */
    State dispenseState =new DispenseState(this);

    /**
     * 奖品库存
     */
    private Integer count;

    /**
     * 初始化奖品数量和抽奖状态--抽奖状态初始化为不能抽奖
     * @param count
     */
    public RaffleActivity(Integer count) {
        this.count = count;
        this.state=noRaffleState;
    }

    /**
     * 调用当前状态的扣积分
     */
    public void debutMoney(){
        state.deductMoney();
    }

    /**
     * 调用当前状态的抽奖
     */
    public void raffle(){
        if(state.raffle()){
            //领奖
            state.dispensePrize();
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 领取一次后，count-1
     * @return
     */
    public Integer getCount() {
        int creCount=count;
        count--;
        return creCount;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public State getDispenseState() {
        return dispenseState;
    }
}
