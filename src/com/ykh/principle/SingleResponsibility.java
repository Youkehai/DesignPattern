package com.ykh.principle;

/**
 * 设计模式原则1：单一职责原则
 * 对类来说的，即一个类应该只负责一项职责。如类A负责两个不同职责: 职责1，职责2.当职责1需求变更而改变A时，可能造成职责2执行错误，所以需要将类A的粒度分解为A1，A2
 *
 * 单一职责原则注意事项和细节
 * 降低类的复杂度，一个类只负责一项职责。
 * 提高类的可读性，可维护性
 * 降低变更引起的风险
 * 通常情况下，我们应当遵守单一职责原则，只有逻辑足够简单，才可以在代码级违
 * 反单一职责原则:只有类中方法数量足够少，可以在方法级别保持单一职责原则
 */
public class SingleResponsibility {

    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.runAir("f飞机");
        vehicle.runRoad("汽车");
        vehicle.runWater("轮船");

        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("船");
    }
}

/**
 * 单一原则方式1：每个类遵循单一原则
 */

/**
 * 路上跑的交通工具
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "公路运行");
    }



}
/**
 * 水上交通工具
 */
class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "水路运行");
    }
}

/**
 * 空中交通工具
 */
class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "天上运行");
    }
}
/**
 * 单一职责方式2：用方法控制单一原则
 */
class Vehicle {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "公路运行");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "天上运行");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "水中运行");
    }
}
