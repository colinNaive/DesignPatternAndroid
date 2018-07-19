package com.ctrip.designpatternapplication.mediator.delegates

import android.app.Activity
import com.ctrip.designpatternapplication.mediator.Mediator

/**
 * @author Zhenhua on 2018/6/26.
 * @email zhshan@ctrip.com ^.^
 */
abstract class BaseDelegate {
    protected lateinit var mMediator: Mediator

    fun setMediator(mediator: Mediator) {
        mMediator = mediator
    }

    abstract fun refresh(activity: Activity)
}