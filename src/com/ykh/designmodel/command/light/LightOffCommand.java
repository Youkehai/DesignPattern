package com.ykh.designmodel.command.light;

import com.ykh.designmodel.command.AllCommand;

/**
 * 灯 关命令
 */
public class LightOffCommand implements AllCommand {
    //聚合具体执行命令的receiver
    LightReceiver receiver;

    public LightOffCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.on();
    }
}
