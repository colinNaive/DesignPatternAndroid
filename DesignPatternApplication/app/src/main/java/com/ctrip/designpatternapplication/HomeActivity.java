package com.ctrip.designpatternapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.ctrip.designpatternapplication.mediator.MediatorActivity;
import com.ctrip.designpatternapplication.observer.ObserverActivity;

/**
 * @author Zhenhua on 2018/7/18.
 * @email zhshan@ctrip.com ^.^
 */
public class HomeActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //中介者模式
        findViewById(R.id.observer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, ObserverActivity.class));
            }
        });
        //观察者模式
        findViewById(R.id.mediator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, MediatorActivity.class));
            }
        });
    }
}
