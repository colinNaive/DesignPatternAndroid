package com.ctrip.designpatternapplication.singleton;

/**
 * @author Zhenhua on 2018/7/17.
 * @email zhshan@ctrip.com ^.^
 */
public class SingTonInnerStatic {

    //将构造函数私有化
    private SingTonInnerStatic() {

    }

    //对外提供
    public static SingTonInnerStatic getInstance() {
        return SingleTonHolder.singleTonInnerStatic;
    }

    //静态内部类
    public static class SingleTonHolder {
        private static final SingTonInnerStatic singleTonInnerStatic = new SingTonInnerStatic();
    }
}
