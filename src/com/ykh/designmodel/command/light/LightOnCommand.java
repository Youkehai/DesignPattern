package com.ykh.designmodel.command.light;

import com.ykh.designmodel.command.AllCommand;

/**
 * 灯 开命令
 */
public class LightOnCommand implements AllCommand {
    //聚合具体执行命令的receiver
    LightReceiver receiver;

    public LightOnCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }
}
