package com.ykh.designmodel.memento;

/**
 * 原始对象
 */
public class Originator {

    /**
     * 原始的状态值
     */
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 保存备份
     * @return 备份对象
     */
    public Memento saveMemento(){
        return new Memento(this.state);
    }

    /**
     * 恢复状态
     * @param memento 指定备份
     */
    public void restoreState(Memento memento){
        this.state=memento.getState();
    }


}
