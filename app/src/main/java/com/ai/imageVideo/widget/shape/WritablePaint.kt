package com.ai.imageVideo.widget.shape

import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.PorterDuffXfermode
import java.io.Serializable

/**
 * Created by user on 2016/10/25.
 */
class WritablePaint : Paint(), Serializable {
    var mColor = 0
    var mWidth = 0f
    var isEraser = false
    fun loadPaint() {
        isAntiAlias = true
        color = mColor
        style = Style.STROKE
        strokeWidth = mWidth
        isDither = true
        strokeJoin = Join.ROUND
        strokeCap = Cap.ROUND
        if (isEraser) {
            xfermode = PorterDuffXfermode(PorterDuff.Mode.DST_IN)
            alpha = 0
            strokeWidth = 100f
        }
    }
}