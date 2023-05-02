/**
 * 观察者模式
 *
 * [
 * <interface >Subject
 * registerObserver()
 * removeObserver()
 * notifyObservers()
 * ]
 * 观察者模式类似订牛奶业务
 * 1.奶站/气象局: Subject
 * 2)用户/第三方网站: Observer
 * Subject: 登记注册、移除和通知
 * registerObserver 注册
 * removeObserver 移除
 * notifyObservers() 通知所有的注册的用户，根据不同需求，可以是更新数据，让用户来取，也可能是实施推送，看具体需求定
 *
 * 观察者模式:对象之间多对一依赖的一种设计方案，被依赖的对象为Subject,依赖的对象为observer，
 * subject通知Observer变化,比如这里的奶站是Subject，是1的一方。用户时Observer，是多的一方。
 */
package com.ykh.designmodel.observer;
