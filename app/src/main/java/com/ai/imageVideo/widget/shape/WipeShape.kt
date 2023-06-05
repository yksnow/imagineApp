package com.ai.imageVideo.widget.shape

import android.graphics.Color

/**
 * Created by user on 2016/10/26.
 */
class WipeShape : CurveShape() {
    init {
        mPaint.color = Color.WHITE
        mPaint.strokeWidth = 100f
    }

    override val path: WritablePath
        get() {
            mPaint.mColor = Color.WHITE
            mPaint.mWidth = 100f
            mPath.mPaint = mPaint
            return mPath
        }
}