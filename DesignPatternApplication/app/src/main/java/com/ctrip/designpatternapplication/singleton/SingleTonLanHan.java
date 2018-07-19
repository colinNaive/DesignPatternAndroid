package com.ctrip.designpatternapplication.singleton;

/**
 * @author Zhenhua on 2018/7/17.
 * @email zhshan@ctrip.com ^.^
 */
public class SingleTonLanHan {

    //构造函数私有化
    private SingleTonLanHan() {

    }

    //声明私有实例对象
    private static SingleTonLanHan singleTonLanHan;

    //对外提供方法，返回并创建实例对象
    public static synchronized SingleTonLanHan getInstance() {
        if (null == singleTonLanHan) {
            singleTonLanHan = new SingleTonLanHan();
        }
        return singleTonLanHan;
    }
}
