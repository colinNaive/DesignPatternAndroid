package com.ctrip.designpatternapplication.singleton;

/**
 * @author Zhenhua on 2018/7/17.
 * @email zhshan@ctrip.com ^.^
 */
public class SingleTonDCL {

    //将构造函数私有化
    private SingleTonDCL() {

    }

    //声明私有化对象
    private static SingleTonDCL singleTonDCL;

    //对外提供，double check lock
    public static SingleTonDCL getInstance() {
        if (null == singleTonDCL) {
            synchronized (SingleTonDCL.class) {
                if (singleTonDCL == null) {
                    singleTonDCL = new SingleTonDCL();
                }
            }
        }
        return singleTonDCL;
    }
}
