package com.ctrip.designpatternapplication.observer;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zhenhua on 2018/7/18.
 * @email zhshan@ctrip.com ^.^
 */
public class Subject {
    //保存注册的观察者对象
    private List<Observer> mObervers = new ArrayList<>();

    //注册观察者对象
    public void attach(Observer observer) {
        mObervers.add(observer);
        Log.e("SZH", "attach an observer");
    }

    //注销观察者对象
    public void detach(Observer observer) {
        mObervers.remove(observer);
        Log.e("SZH", "detach an observer");
    }

    //通知所有注册的观察者对象
    public void notifyEveryOne(String newState) {
        for (Observer observer : mObervers) {
            observer.update(newState);
        }
    }
}
