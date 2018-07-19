package com.ctrip.designpatternapplication.observer;

import android.util.Log;

/**
 * @author Zhenhua on 2018/7/18.
 * @email zhshan@ctrip.com ^.^
 */
public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState) {
        state = newState;
        Log.e("SZH", "concreteSubject state:" + newState);

        //状态发生改变，通知观察者
        notifyEveryOne(newState);
    }
}
