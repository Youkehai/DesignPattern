package com.ykh.designmodel.command;

/**
 * 所有命令实现的接口
 */
public interface AllCommand {

    /**
     * 具体执行
     */
    void execute();

    /**
     * 撤销
     */
    void undo();
}
