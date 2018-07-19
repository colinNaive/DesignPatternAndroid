package com.ctrip.designpatternapplication.observer;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

/**
 * @author Zhenhua on 2018/7/18.
 * @email zhshan@ctrip.com ^.^
 */
public class ObserverActivity extends Activity {
    private ConcreteSubject mConcreteSubject;
    private ObserverA mObserverA;
    private ObserverB mObserverB;
    private ObserverC mObserverC;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mConcreteSubject = new ConcreteSubject();
        mObserverA = new ObserverA();
        mObserverB = new ObserverB();
        mObserverC = new ObserverC();

        mConcreteSubject.attach(mObserverA);
        mConcreteSubject.attach(mObserverB);
        mConcreteSubject.attach(mObserverC);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mConcreteSubject.change("倒计时结束，开始秒杀");
            }
        }, 3000);
    }
}
