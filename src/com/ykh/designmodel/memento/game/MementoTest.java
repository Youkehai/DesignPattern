package com.ykh.designmodel.memento.game;

public class MementoTest {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        System.out.println("开始游戏前的状态");
        gameRole.setVit(100);
        gameRole.setDef(100);
        gameRole.display();
        //保存游戏前的状态
        Caretaker caretaker = new Caretaker();
        caretaker.add(gameRole.createMemento());
        System.out.println("=========正在游戏中========");
        gameRole.setVit(30);
        gameRole.setDef(20);
        gameRole.display();
        System.out.println("=========游戏后,恢复状态========");
        gameRole.restoreState(caretaker.get(0));
        gameRole.display();
    }
}
