package com.ctrip.designpatternapplication.mediator.delegates

import android.app.Activity
import android.widget.TextView
import android.widget.Toast
import com.ctrip.designpatternapplication.R

/**
 * @author Zhenhua on 2018/6/26.
 * @email zhshan@ctrip.com ^.^
 */
class DelegateC : BaseDelegate() {
    private var mActivity: Activity? = null
    private var mCount = 0

    override fun refresh(activity: Activity) {
        mActivity = activity
        activity.findViewById<TextView>(R.id.bbb).apply {
            setOnClickListener {
                mCount++
                this.text = "C部分$mCount"
                notifyOthers()
            }
        }
    }

    private fun notifyOthers() {
        mMediator.notifyB("C")
    }

    fun doSomething(input: String) {
        Toast.makeText(mActivity, "我来自C,${input}被点击了", Toast.LENGTH_LONG).show()
    }
}