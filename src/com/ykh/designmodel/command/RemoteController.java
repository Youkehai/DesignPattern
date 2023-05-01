package com.ykh.designmodel.command;

public class RemoteController {

    /**
     * 开的命令
     */
    AllCommand[] onCommands;
    /**
     * 关的命令
     */
    AllCommand[] offCommands;

    /**
     * 记录上一次的命令，用于撤销
     */
    AllCommand undoCommand;

    public RemoteController() {
        this.onCommands = new AllCommand[5];
        this.offCommands = new AllCommand[5];
        //初始化为空命令
        for (int i = 0; i < 5; i++) {
            this.onCommands[i]=new NoCommand();
            this.offCommands[i]=new NoCommand();
        }
    }

    /**
     * 给具体下标的按钮，设置对应的命令实现类
     * @param index 第几排的按钮
     * @param onCommand 打开命令
     * @param offCommand 关闭命令
     */
    public void setCommand(int index,AllCommand onCommand,AllCommand offCommand){
        this.onCommands[index]=onCommand;
        this.offCommands[index]=offCommand;
    }

    /**
     * 按下开的按钮
     * @param index 第几排
     */
    public void onButtonWasPushed(int index){
        this.onCommands[index].execute();
        //记录本次操作，用于撤回
        undoCommand=this.onCommands[index];
    }

    /**
     * 按下关的按钮
     * @param index 第几排
     */
    public void offButtonWasPushed(int index){
        this.offCommands[index].execute ();
        //记录本次操作，用于撤回
        undoCommand=this.offCommands[index];
    }

    /**
     * 按下撤销的按钮
     */
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
