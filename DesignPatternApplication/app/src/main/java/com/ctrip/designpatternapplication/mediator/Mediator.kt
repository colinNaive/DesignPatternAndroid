package com.ctrip.designpatternapplication.mediator

import com.ctrip.designpatternapplication.mediator.delegates.DelegateA
import com.ctrip.designpatternapplication.mediator.delegates.DelegateB
import com.ctrip.designpatternapplication.mediator.delegates.DelegateC

/**
 * @author Zhenhua on 2018/6/26.
 * @email zhshan@ctrip.com ^.^
 */
class Mediator {
    private var mDelegateA: DelegateA? = null
    private var mDelegateB: DelegateB? = null
    private var mDelegateC: DelegateC? = null

    constructor(delegateA: DelegateA, delegateB: DelegateB, delegateC: DelegateC) {
        mDelegateB = delegateB
        mDelegateA = delegateA
        mDelegateC = delegateC
    }

    fun notifyA(from: String) {
        mDelegateA?.doSomeThing(from)
    }

    fun notifyB(from: String) {
        mDelegateB?.doSomething(from)
    }

    fun notifyC(from: String) {
        mDelegateC?.doSomething(from)
    }
}