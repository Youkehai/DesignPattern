1.创建新的对象比较复杂时，可以利用原型模式简化对象的创建过程，同时也能够提高效率<br/>
2.不用重新初始化对象，而是动态地获得对象运行时的状态<br/>
3.如果原始对象发生变化(增加或者减少属性)，其它克隆对象的也会发生相应的编号无需修改代码<br/>
4.在实现深克隆的时候可能需要比较复杂的代码<br/>
5.缺点:需要为每一个类配备一个克隆方法，这对全新的类来说不是很难，但对已有的类进行改造时，需要修改其源代码，违背了ocp原则，这点请注意.