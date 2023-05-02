package com.ykh.designmodel.visitor;

import com.ykh.designmodel.visitor.action.Fail;
import com.ykh.designmodel.visitor.action.Success;
import com.ykh.designmodel.visitor.action.Wait;

/**
 * 访问者模式
 * {@link Woman} 查看双分派介绍
 *
 * >优点
 * 1. 访问者模式符合单一职责原则、让程序具有优秀的扩展性、灵活性非常高
 * 2. 访问者模式可以对功能进行统一，可以做报表、UI、拦截器与过滤器，适用于数据结构相对稳定的系统
 * >缺点
 * 1. 具体元素对访问者公布细节，也就是说访问者关注了其他类的内部细节，这是迪米特法则所不建议的.这样造成了具体元素变更比较困难
 * 2. 违背了依赖倒转原则。访问者依赖的是具体元素，而不是抽象元素
 * 3. 因此，如果一个系统有比较稳定的数据结构，又有经常变化的功能需求，那么访问者模式就是比较合适的.
 */
public class VisitorTest {

    public static void main(String[] args) {
        //创建 objectStruct
        ObjectStruct objectStruct = new ObjectStruct();
        //放入一个男观众和一个女观众
        objectStruct.attach(new Man());
        objectStruct.attach(new Woman());
        //好评
        Success success=new Success();
        //展示结果
        objectStruct.display(success);
        //差评
        Fail fail = new Fail();
        //展示结果
        objectStruct.display(fail);
        //待定
        Wait wait = new Wait();
        objectStruct.display(wait);
    }
}
