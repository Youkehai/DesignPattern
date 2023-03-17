package com.ykh.designmodel.adapter.springmvcadapter;

/**
 * 适配器
 */
public interface HandlerAdapter {
    public void handle(Object handler);

    public boolean supports(Object handler);
}

/**
 * 多种适配器类
 */
class SimpleHandlerAdapter implements HandlerAdapter{

    @Override
    public void handle(Object handler) {
        ((SimpleController)handler).doSimpleHandle();
    }

    @Override
    public boolean supports(Object handler) {
        return handler instanceof SimpleController;
    }
}

class HttpHandlerAdapter implements HandlerAdapter{

    @Override
    public void handle(Object handler) {
        ((HttpController)handler).doHttpHandle();
    }

    @Override
    public boolean supports(Object handler) {
        return handler instanceof HttpController;
    }
}

class AnnotationHandlerAdapter implements HandlerAdapter{

    @Override
    public void handle(Object handler) {
        ((AnnotationController)handler).doAnnotationHandle();
    }

    @Override
    public boolean supports(Object handler) {
        return handler instanceof AnnotationController;
    }
}
