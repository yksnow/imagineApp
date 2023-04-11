package com.example.test.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast

/**
 * Created by yaoletian on 2023/4/10.
 */
object MyUtils {

    fun showShot(context: Context?, msg: String?) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    fun showLong(context: Context?, msg: String?) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

    /**
     * 带参数跳转的Activity  如：startAct<TestActivity>()
     *
     * @param [T]            跳转的 Activity
     * @param [data]         携带的数据  可为空
     * @param [requestCode]  请求 code 当不为0时，startActivityForResult
     */
    inline fun <reified T : Activity> Context.startActivity(
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