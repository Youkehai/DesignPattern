package com.ykh.designmodel.visitor;

import com.ykh.designmodel.visitor.action.Action;

/**
 * 使用到了双分派
 * 首先在客户端的程序中，将具体参数作为参数，传递给了woman中，完成第一次分派
 * 然后在woman类中，调用作为参数的具体方法中的方法getWomanResult，将自己作为参数传入，完成第二次分派
 *
 * 上面提到了双分派，所谓双分派是指不管类怎么变化，我们都能找到期望的方法运行双分派意味着得到执行的操作取决于请求的种类和两个接收者的类型
 * 以上述实例为例，假设我们要添加一个Wait的状态类，考察Man类和Woman类的反应，由于使用了双分派，只需增加一个Action子类即可在客户端调用即可，不需要改动任何其他类的代码
 */
public class Woman extends Person{
    @Override
    void accept(Action action) {
        action.getWomanResult(this);
    }
}
