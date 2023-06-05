package com.ai.imageVideo.utils

import android.widget.Toast
import com.ai.imageVideo.myapplication.MyApplication

/**
 * Created by yaoletian on 2023/4/10.
 */
fun String.showToast(duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(MyApplication.context,this,duration).show()
}

fun Int.showToast(duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(MyApplication.context,this.toString(),duration).show()
}