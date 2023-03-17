package com.ykh.designmodel.adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V {
    /**持有被适配器的类，而不是去继承被适配器*/
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        //拿到220v的电压
        int src=voltage220V.output();
        //处理为手机可接受的5v电压
        System.out.println("通过适配器将"+src+"V转为"+src/44+"V");
        return src/44;
    }
}
