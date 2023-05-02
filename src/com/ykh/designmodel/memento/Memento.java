package com.ykh.designmodel.memento;

/**
 * 保存备忘的数据
 */
public class Memento {

    /**
     * 备份的状态值
     */
    private String state;

    public String getState() {
        return state;
    }

    public Memento(String state) {
        this.state = state;
    }
}
