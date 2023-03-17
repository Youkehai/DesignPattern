package com.ykh.designmodel.adapter.springmvcadapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.Spring定义了一个适配接口，使得每一种Controller有一种对应的适配器实现类适配器代替controller执行相应的方法
 * 2.扩展Controller 时，只需要增加一个适配器类就完成了SpringMVC的扩展了
 */
public class DispatchServlet {

    public static List<HandlerAdapter> handlerAdapterList = new ArrayList<>();

    public DispatchServlet() {
        handlerAdapterList.add(new AnnotationHandlerAdapter());
        handlerAdapterList.add(new HttpHandlerAdapter());
        handlerAdapterList.add(new SimpleHandlerAdapter());
    }

    public void doDispatch() {
        // 此处模拟SpringMVC从request取handler的对象，
        // 适配器可以获取到希望的Controller
        // HttpController controller = new HttpController();
        AnnotationController controller = new AnnotationController();
        //SimpleController controller = new SimpleController();// 得到对应适配器
        HandlerAdapter adapter = getHandler(controller);
        //通过适配器执行对应的controller方法
        adapter.handle(controller);
    }

    /**
     * 通过controller的类型，拿到对应的适配器
     * @param controller
     * @return
     */
    public HandlerAdapter getHandler(Controller controller){
        for (HandlerAdapter handlerAdapter : handlerAdapterList) {
            if(handlerAdapter.supports(controller)){
                return handlerAdapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatchServlet().doDispatch();
    }
}
