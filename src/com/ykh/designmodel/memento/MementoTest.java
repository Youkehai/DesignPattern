package com.ykh.designmodel.memento;

/**
 * 备忘录模式
 *
 * 1)originator :对象(需要保存状态的对象)
 * 2)Memento: 备忘录对象,负责保存好记录，即Originator内部状态
 * 3)Caretaker: 守护者对象,负责保存多个备忘录对象，使用集合管理，提高效
 * 4)说明:如果希望保存多个originator对象的不同时间的状态，也可以，只需要要 HashMap<String，集合>
 */
public class MementoTest {

    public static void main(String[] args) {
        //原始对象
        Originator originator = new Originator();
        //备份集合
        Caretaker caretaker=new Caretaker();
        //设置原始对象的状态值
        originator.setState("状态1");
        //备份originator当前的状态记录
        caretaker.add(originator.saveMemento());
        //状态变化
        originator.setState("状态2");
        //备份
        caretaker.add(originator.saveMemento());
        //再变化
        originator.setState("状态3");
        //再备份
        caretaker.add(originator.saveMemento());
        //现在需要恢复到状态1
        System.out.println("当前状态为："+originator.getState());
        System.out.println("=============开始恢复状态===================");
        originator.restoreState(caretaker.get(0));
        System.out.println("状态恢复为："+originator.getState());
    }
}
