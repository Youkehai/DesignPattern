package com.ykh.designmodel.adapter.classadapter;

/**继承被适配器，以方便调用被适配器方法*/
public class VoltageAdapter extends Voltage220V implements IVoltage5V{

    @Override
    public int output5V() {
        //拿到220v的电压
        int src=super.output();
        //处理为手机可接受的5v电压
        System.out.println("通过适配器将"+src+"V转为"+src/44+"V");
        return src/44;
    }
}
