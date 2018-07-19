package com.ctrip.designpatternapplication.singleton;

/**
 * @author Zhenhua on 2018/7/17.
 * @email zhshan@ctrip.com ^.^
 */
public class SingleTonEHan {
    //将构造函数私有化
    private SingleTonEHan() {
    }

    //创建私有实例对象
    private static final SingleTonEHan singleTonInstance = new SingleTonEHan();

    //对外提供方法，返回实例对象
    public static SingleTonEHan getInstance() {
        return singleTonInstance;
    }
}
