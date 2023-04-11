package com.example.test.utils

import android.content.Context
import android.widget.Toast
import com.example.test.myapplication.MyApplication

/**
 * Created by yaoletian on 2023/4/10.
 */
fun String.showToast(duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(MyApplication.context,this,duration).show()
}

fun Int.showToast(duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(MyApplication.context,this.toString(),duration).show()
}