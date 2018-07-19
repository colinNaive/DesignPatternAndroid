package com.ctrip.designpatternapplication.observer;

import android.util.Log;

/**
 * @author Zhenhua on 2018/7/18.
 * @email zhshan@ctrip.com ^.^
 */
public class ObserverA implements Observer {

    //观察者状态
    private String observerState;

    @Override
    public void update(String newState) {
        //更新观察者状态，让它与目标状态一致
        observerState = newState;
        Log.e("SZH", "接收到消息：" + newState + "；我是A模块，快来抢吧！！");
    }
}
