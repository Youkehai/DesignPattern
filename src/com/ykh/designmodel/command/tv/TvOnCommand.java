package com.ykh.designmodel.command.tv;

import com.ykh.designmodel.command.AllCommand;

/**
 * 灯 开命令
 */
public class TvOnCommand implements AllCommand {
    //聚合具体执行命令的receiver
    TvReceiver receiver;

    public TvOnCommand(TvReceiver receiver) {
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
