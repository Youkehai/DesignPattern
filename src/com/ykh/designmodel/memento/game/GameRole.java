package com.ykh.designmodel.memento.game;


public class GameRole {
    /**
     * 攻击力
     */
    private int vit;

    /**
     * 防御力
     */
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    /**
     * 保存备份,根据当前的状态，创建一份 Memento
     * @return 备份对象
     */
    public Memento createMemento(){
        return new Memento(this.vit,this.def);
    }

    /**
     * 恢复状态
     * @param memento 指定备份
     */
    public void restoreState(Memento memento){
        this.vit=memento.getVit();
        this.def=memento.getDef();
    }

    public void display(){
        System.out.println("当前攻击力："+this.vit+",当前的防御力："+this.def);
    }
}
