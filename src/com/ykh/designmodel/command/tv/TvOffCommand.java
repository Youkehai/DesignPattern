package com.ykh.designmodel.command.tv;

import com.ykh.designmodel.command.AllCommand;

/**
 * 灯 关命令
 */
public class TvOffCommand implements AllCommand {
    //聚合具体执行命令的receiver
    TvReceiver receiver;

    public TvOffCommand(TvReceiver receiver) {
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
