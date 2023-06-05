package com.ai.imageVideo.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import java.io.Serializable

/**
 * 业务名:    <br></br>
 * 功能说明: Activity路由 <br></br>
 * 编写日期:	2019-07-18
 * 作者:	姚乐天
 *
 *
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */
object ActivityRouter {
    /**
     * @param context
     * @param targetClazz 检查token
     */
    fun checkToken(context: Context?, targetClazz: Class<out Activity?>?) {
        checkToken(context, -100, targetClazz)
    }

    /**
     * @param context
     * @param code
     * @param targetClazz 检查token
     */
    fun checkToken(
        context: Context?, code: Int,
        targetClazz: Class<out Activity?>?
    ) {
//        if (!UserManagement.isLogin()// 未登录
//                || (code != -100 && ErrorConsts.TOKEN_FAILED == code)){// token过期
////            LoginDialog loginDialog = new LoginDialog(context);
////            loginDialog.show();
//            overlay(context, LoginActivity.class);
//        } else {
//            overlay(context, targetClazz);
//        }
    }

    fun <T> getParcelableExtra(activity: Activity?): T? {
        var activity = activity
        val parcelable = activity!!.intent.getParcelableExtra<Parcelable>(PARCELABLE_EXTRA_KEY)
        activity = null
        return parcelable as T?
    }

    private const val PARCELABLE_EXTRA_KEY = "ROUTER_PARCELABLE_EXTRA_KEY"
    private fun overlay(
        context: Context,
        targetClazz: Class<out Activity>,
        flags: Int,
        parcelable: Parcelable
    ) {
        var context: Context? = context
        val intent = Intent(context, targetClazz)
        setFlags(intent, flags)
        putParcelableExtra(intent, parcelable)
        context!!.startActivity(intent)
        context = null
    }

    private fun forward(
        context: Context,
        targetClazz: Class<out Activity>,
        flags: Int,
        parcelable: Parcelable
    ) {
        var context: Context? = context
        val intent = Intent(context, targetClazz)
        setFlags(intent, flags)
        intent.putExtra(PARCELABLE_EXTRA_KEY, parcelable)
        context!!.startActivity(intent)
        if (isActivity(context)) return
        (context as Activity?)!!.finish()
        context = null
    }

    private fun forward(
        context: Context,
        targetClazz: Class<out Activity>,
        parcelable: Parcelable
    ) {
        var context: Context? = context
        val intent = Intent(context, targetClazz)
        putParcelableExtra(intent, parcelable)
        context!!.startActivity(intent)
        if (isActivity(context)) return
        (context as Activity?)!!.finish()
        context = null
    }

    private fun forward(
        context: Context,
        targetClazz: Class<out Activity>,
        serializable: Serializable
    ) {
        var context: Context? = context
        val intent = Intent(context, targetClazz)
        putSerializableExtra(intent, serializable)
        context!!.startActivity(intent)
        if (isActivity(context)) return
        (context as Activity?)!!.finish()
        context = null
    }

    private fun forward(context: Context, targetClazz: Class<out Activity>) {
        var context: Context? = context
        val intent = Intent(context, targetClazz)
        context!!.startActivity(intent)
        if (isActivity(context)) return
        (context as Activity?)!!.finish()
        context = null
    }

    fun startForResult(context: Context?, targetClazz: Class<out Activity?>?, flags: Int) {
        var context = context
        val intent = Intent(context, targetClazz)
        if (isActivity(context)) return
        (context as Activity?)!!.startActivityForResult(intent, flags)
        context = null
    }

    fun startForResult(
        context: Context?,
        targetClazz: Class<out Activity?>?,
        flags: Int,
        bundle: Bundle?
    ) {
        var context = context
        val intent = Intent(context, targetClazz)
        intent.putExtras(bundle!!)
        if (isActivity(context)) return
        (context as Activity?)!!.startActivityForResult(intent, flags)
        context = null
    }

    private fun startForResult(
        context: Context,
        targetClazz: Class<out Activity>,
        flags: Int,
        parcelable: Parcelable
    ) {
        var context: Context? = context
        val intent = Intent(context, targetClazz)
        if (isActivity(context)) return
        putParcelableExtra(intent, parcelable)
        (context as Activity?)!!.startActivityForResult(intent, flags)
        context = null
    }

    private fun setResult(
        context: Context,
        targetClazz: Class<out Activity>,
        flags: Int,
        parcelable: Parcelable
    ) {
        val intent = Intent(context, targetClazz)
        setFlags(intent, flags)
        putParcelableExtra(intent, parcelable)
        if (isActivity(context)) return
        (context as Activity).setResult(flags, intent)
        context.finish()
    }

    private fun isActivity(context: Context?): Boolean {
        return if (context !is Activity) true else false
    }

    private fun setFlags(intent: Intent, flags: Int) {
        if (flags < 0) return
        intent.flags = flags
    }

    private fun putParcelableExtra(intent: Intent, parcelable: Parcelable?) {
        if (parcelable == null) return
        intent.putExtra(PARCELABLE_EXTRA_KEY, parcelable)
    }

    private fun putSerializableExtra(intent: Intent, serializable: Serializable?) {
        if (serializable == null) return
        intent.putExtra(PARCELABLE_EXTRA_KEY, serializable)
    }

    /**
     * 跳转到权限设置界面
     */
    fun getAppDetailSettingIntent(context: Context, packageName: String?) {
        val intent = Intent()
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        if (Build.VERSION.SDK_INT >= 9) {
            intent.action = "android.settings.APPLICATION_DETAILS_SETTINGS"
            intent.data = Uri.fromParts("package", packageName, null)
        } else if (Build.VERSION.SDK_INT <= 8) {
            intent.action = Intent.ACTION_VIEW
            intent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails")
            intent.putExtra("com.android.settings.ApplicationPkgName", packageName)
        }
        context.startActivity(intent)
    }
}