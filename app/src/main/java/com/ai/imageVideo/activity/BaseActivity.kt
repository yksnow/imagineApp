package com.ai.imageVideo.activity

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState,)
    }

    /**
     * 带参数跳转的Activity  如：startAct<TestActivity>()
     *
     * @param [T]            跳转的 Activity
     * @param [data]         携带的数据  可为空
     * @param [requestCode]  请求 code 当不为0时，startActivityForResult
     */
    public inline fun <reified T : Activity> Context.startActivity1(
        data: Bundle? = null,
        requestCode: Int? = 0
    ) {
        val intent = Intent(this, T::class.java)
        if (data != null) {
            intent.putExtras(data)
        }
        if (requestCode != 0) {
            requestCode?.let { (this as Activity).startActivityForResult(intent, it) }
        } else {
            this.startActivity(intent)
        }

    }
}