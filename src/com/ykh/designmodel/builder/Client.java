package com.ykh.designmodel.builder;

/**
 * 测试建造者模式
 */
public class Client {
    public static void main(String[] args) {
        //构建子类1
        ConcreteProductBuilder concreteProductBuilder = new ConcreteProductBuilder();
        //构建指挥者
        ProductDirector productDirector = new ProductDirector(concreteProductBuilder);
        //完成产品子类1制作
        Product product = productDirector.executeStep();
        System.out.println("-------------------------------");
        //构建子类2
        ConcreteProductTwoBuilder concreteProductTwoBuilder=new ConcreteProductTwoBuilder();
        productDirector.setProductBuilder(concreteProductTwoBuilder);
        //完成产品子类2制作
        Product product2= productDirector.executeStep();
    }
}
