package com.example.test.widget.shape

import android.graphics.Canvas
import android.os.Build
import androidx.annotation.RequiresApi

/**
 * Created by linlongxin on 2016/10/24.
 */
class OvalShape : RectShape() {
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    override fun draw(canvas: Canvas?) {
        canvas!!.drawOval(
            mStartX.toFloat(),
            mStartY.toFloat(),
            mEndX.toFloat(),
            mEndY.toFloat(),
            mPaint
        )
    }
}