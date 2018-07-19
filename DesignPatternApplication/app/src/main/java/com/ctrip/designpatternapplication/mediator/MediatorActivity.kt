package com.ctrip.designpatternapplication.mediator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ctrip.designpatternapplication.R
import com.ctrip.designpatternapplication.mediator.delegates.DelegateA
import com.ctrip.designpatternapplication.mediator.delegates.DelegateB
import com.ctrip.designpatternapplication.mediator.delegates.DelegateC

class MediatorActivity : AppCompatActivity() {
    private lateinit var mDelegateA: DelegateA
    private lateinit var mDelegateB: DelegateB
    private lateinit var mDelegateC: DelegateC
    private lateinit var mMediator: Mediator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mDelegateA = DelegateA()
        mDelegateB = DelegateB()
        mDelegateC = DelegateC()

        mMediator = Mediator(mDelegateA, mDelegateB, mDelegateC)
        mDelegateA.setMediator(mMediator)
        mDelegateB.setMediator(mMediator)
        mDelegateC.setMediator(mMediator)

        mDelegateA.refresh(this)
        mDelegateB.refresh(this)
        mDelegateC.refresh(this)
    }
}
