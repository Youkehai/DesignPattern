package com.ykh.designmodel.command;

/**
 * 空命令，用于初始化每个按钮
 * 可以省略掉对空的判断，如果未实现的具体命令，全是调用空命令
 */
public class NoCommand implements AllCommand{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
