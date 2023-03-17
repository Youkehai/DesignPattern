package com.ykh.designmodel.prototype;

/**
 * 原型模式
 * 1.原型模式(Prototype模式)是指: 用原型实例指定创建对象的种类，并且通过拷贝这些原型，创建新的对象
 * 2.原型模式是一种创建型设计模式，允许一个对象再创建另外一个可定制的对象无需知道如何创建的细节
 * 3.工作原理是:通过将一个原型对象传给那个要发动创建的对象，这个要发动创建3的对象通过请求原型对象拷贝它们自己来实施创建，即 对象.clone()
 * 4.形象的理解:孙大圣拔出猴毛， 变出其它孙大圣
 */
public class Prototype implements Cloneable{

    private String name;

    private String color;

    private Integer age;

    public Prototype(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype prototype=null;
        prototype= (Prototype) super.clone();
        return prototype;
    }
}
