package com.ykh.designmodel.prototype;

import java.io.*;

/**
 * 深拷贝
 * 1.复制对象的所有基本数据类型的成员变量值
 * 2.为所有引用数据类型的成员变量申请存储空间，:并复制每个引用数据类型成员变量所引用的对象，直到该对象可达的所有对象。也就是说，对象进行深拷贝要对整个对象进行拷贝
 * 3.深拷贝实现方式1: 重写clone方法来实现深拷贝
 * 4.深拷贝实现方式2: 通过对象序列化实现深拷贝
 */
public class DeepCopy implements Serializable {

    /**
     * 使用序列化实现深拷贝
     * @return
     */
    public Object deepClone(){
        ByteArrayOutputStream bos=null;
        ObjectOutputStream oos=null;
        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;
        try {
            //序列化
            bos=new ByteArrayOutputStream();
            oos=new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);
            DeepCopy o = (DeepCopy)ois.readObject();
            return o;
        }catch (Exception e){
            e.printStackTrace();;
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
