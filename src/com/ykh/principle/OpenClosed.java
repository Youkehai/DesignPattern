package com.ykh.principle;

/**
 * 开闭原则
 *
 * 1 开闭原则 (Open Closed Principle) 是编程中最基础、最重要的设计原则
 * 2 一个软件实体如类，模块和函数应该对扩展开放(对提供方)，对修改关闭(对使用方)。用抽象构建框架，用实现扩展细节。
 * 3 当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。
 * 4 编程中遵循其它原则，以及使用设计模式的目的就是遵循开闭原则
 */
public class OpenClosed {

    public static void main(String[] args) {
        GraphicEditor graphicEditor=new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Other());
    }
}

/**
 * 使用方
 */
class GraphicEditor{
    public void drawShape(Shape s){
        s.draw();
    }
}

/**
 * 基类
 */
abstract class Shape{
    int m_type;

    public abstract void draw();

}

/**
 * 矩形
 */
class Rectangle extends Shape{

    Rectangle(){
        super.m_type=3;
    }
    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

/**
 * 圆
 */
class Circle extends Shape{

    Circle(){
        super.m_type=3;
    }
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

/**
 * 三角形
 */
class Triangle extends Shape{

    Triangle(){
        super.m_type=3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

/**
 * 新增一个别的图形
 */
class Other extends Shape{

    Other(){
        super.m_type=4;
    }

    @Override
    public void draw() {
        System.out.println("绘制别的");
    }
}
