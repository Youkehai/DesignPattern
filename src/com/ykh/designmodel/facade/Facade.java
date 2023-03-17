package com.ykh.designmodel.facade;

/**
 * 外观模式
 *
 * 1) 外观模式 (Facade)，也叫“过程模式: 外观模式为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用
 * 2）外观模式通过定义一个一致的接口，用以屏蔽内部子系统的细节，使得调用端2)只需跟这个接口发生调用，而无需关心这个子系统的内部细节
 *
 * 原理类图的说明(外观模式的角色)
 * 1)外观类Facade): 为调用端提供统一的调用接口，外观类知道哪些子系统负责处理请求,从而将调用端的请求代理给适当子系统对象
 * 2）调用者(client):外观接口的调用者
 * 3）子系统的集合: 指模块或者子系统，处理Facade 对象指派的任务，他是功能的实际提供者
 *
 * 1）外观模式可以理解为转换一群接口，客户只要调用一个接口，而不用调用多个接口才能达到目的。
 * 比如:在pc上安装软件的时候经常有一键安装选项(省去选择安装目录、安装的组件等等)，还有就是手机的重启功能(把关机和启动合为一个操作)。
 * 2)外观模式就是解决多个复杂接口带来的使用困难，起到简化用户操作的作用
 *
 * 外观模式在Mybatis中的应用
 * MyBatis 中的Configuration 去创建MetaObject 对象使用到外观模式
 */
public class Facade {

    //外观模式，
    // 1.定义各个子系统对象
    private DvdPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLight theaterLight;

    public Facade() {
        this.dvdPlayer = DvdPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }

    //2.将操作分为对应的步骤
    //播放前的准备操作
    public void ready(){
        popcorn.open();
        popcorn.play();
        screen.down();
        dvdPlayer.open();
        projector.open();
        stereo.open();
        theaterLight.close();
    }

    //开始播放
    public void play(){
        projector.focus();
        dvdPlayer.play();
    }
    //暂停
    public void pause(){
        dvdPlayer.pause();
    }
    //结束
    public void end(){
        popcorn.close();
        screen.up();
        dvdPlayer.close();
        projector.close();
        stereo.close();
        theaterLight.up();
    }


    public static void main(String[] args) {
        //看创建的类，模拟的是电影院播放电影的流程
        //需要dvd 爆米花 投影仪 投影仪屏幕 立体音效 灯光一个个全部打开
        //如果不使用外观模式，需要一个个类去创建并调用 很麻烦
        //使用外观类，分步骤
        Facade facade=new Facade();
        facade.ready();
        facade.play();
        facade.end();
    }
}
