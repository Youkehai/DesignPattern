package com.ykh.designmodel.adapter.springmvcadapter;

public interface Controller {
}

/**
 * 多钟controller的实现
 */
class HttpController implements Controller{
    public void doHttpHandle(){
        System.out.println("Http controller");
    }
}
class SimpleController implements Controller{
    public void doSimpleHandle(){
        System.out.println("Simple controller");
    }
}

class AnnotationController implements Controller{
    public void doAnnotationHandle(){
        System.out.println("Annotation controller");
    }
}
