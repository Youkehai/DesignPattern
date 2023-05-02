package com.ykh.designmodel.command;

import com.ykh.designmodel.command.light.LightOffCommand;
import com.ykh.designmodel.command.light.LightOnCommand;
import com.ykh.designmodel.command.light.LightReceiver;
import com.ykh.designmodel.command.tv.TvOffCommand;
import com.ykh.designmodel.command.tv.TvOnCommand;
import com.ykh.designmodel.command.tv.TvReceiver;

/**
 * 命令模式（Command Design Model）
 *
 * 命令模式的注意事项和细节
 * 1.将发起请求的对象与执行请求的对象解耦。发起请求的对象是调用者，调用者只要调用命令对象的execute()方法就可以让接收者工作，而不必知道具体的接收者对象是谁、
 *   是如何实现的，命令对象会负责让接收者执行请求的动作，也就是说:”请求发起者”和“请求执行者”之间的解羯是通过命令对象实现的，命令对象起到了纽带桥梁的作用。
 * 2. 容易设计一个命令队列。只要把命令对象放到列队，就可以多线程的执行命令
 * 3. 容易实现对请求的撤销和重做
 * 4. 命令模式不足:可能导致某些系统有过多的具体命令类，增加了系统的复杂度，这点在在使用的时候要注意
 * 5. 空命令也是一种设计模式，它为我们省去了判空的操作。在上面的实例中，如果没有用空命令，我们每按下一个按键都要判空，这给我们编码带来一定的麻烦。
 * 6. 命令模式经典的应用场景:界面的一个按钮都是一条命令、模拟CMD(DOS命令)订单的撤销/恢复、触发-反馈机制
 */
public class CommandTest {

    public static void main(String[] args) {
        //创建receiver，实际执行者
        LightReceiver lightReceiver = new LightReceiver();
        //创建打开和关闭命令
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        //创建遥控器
        RemoteController remoteController = new RemoteController();
        //给遥控器设置命令,默认0 下标 为电灯开关
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        //按下开
        System.out.println("--------按下了的灯的开---------");
        remoteController.onButtonWasPushed(0);
        //关
        System.out.println("--------按下了的灯的关---------");
        remoteController.offButtonWasPushed(0);
        System.out.println("--------按下了灯的撤销---------");
        //撤销关闭命令
        remoteController.undoButtonWasPushed();

        //创建receiver，实际执行者
        TvReceiver tvReceiver = new TvReceiver();
        //创建打开和关闭命令
        TvOffCommand tvOffCommand = new TvOffCommand(tvReceiver);
        TvOnCommand tvOnCommand = new TvOnCommand(tvReceiver);
        //给遥控器设置命令,默认1 下标 为电视机开关
        remoteController.setCommand(1,tvOnCommand,tvOffCommand);
        //按下开
        System.out.println("--------按下了的电视的开---------");
        remoteController.onButtonWasPushed(1);
        //关
        System.out.println("--------按下了的电视的关---------");
        remoteController.offButtonWasPushed(1);
        System.out.println("--------按下了电视的撤销---------");
        //撤销关闭命令
        remoteController.undoButtonWasPushed();
    }
}
