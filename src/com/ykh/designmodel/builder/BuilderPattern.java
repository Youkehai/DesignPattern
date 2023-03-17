package com.ykh.designmodel.builder;

/**
 * 建造者模式
 *
 * 1) 建造者模式 (BuilderPattern) 又叫生成器模式，是一种对象构建模式。它可以
 * 将复杂对象的建造过程抽象出来(抽象类别)，使这个抽象过程的不同实现方法可以构造出不同表现(属性) 的对象。
 * 2）建造者模式是一步一步创建一个复杂的对象，它允许用户只通过指定复杂对象的类型和内容就可以构建它们，用户不需要知道内部的具体构建细节。
 *
 * 建造者模式的四个角色
 * 1) Product(产品角色) : 一个具体的产品对象。
 * 2) Builder(抽象建造者): 创建一个Product对象的各个部件指定的接口/抽象类。
 * 3）ConcreteBuilder (具体建造者): 实现接口，构建和装配各个部件。
 * 4）Director(指挥者): 构建一个使用Builder接口的对象。它主要是用于创建一个复杂的对象。
 *    它主要有两个作用，一是: 隔离了客户与对象的生产过程，二是:负责控制产品对象的生产过程。
 *
 *  JDK StringBuilder中使用建造者模式
 * @see StringBuilder
 * @see AbstractStringBuilder
 * @see Appendable *
 * 1.Appendable 接口定义了多个append方法(抽象方法)，即Appendable 为抽象建造者, 定义了抽象方法
 * 2.AbstractStringBuilder 实现了 Appendable 接口方法，这里的AbstractstringBuilder 已经是建造者，只是不能实例化
 * 3.StringBuilder 即充当了指挥者角色，同时充当了具体的建造者，建造方法的实现是由 AbstractStringBuilder 完成,而StringBuilder 继承了AbstractStringBuilder
 *
 */
public class BuilderPattern {
}
