package com.example.test.widget.shape

import android.graphics.Canvas
import android.graphics.Rect
import android.util.Log

/**
 * Created by linlongxin on 2016/10/24.
 */
open class RectShape : DrawShape() {
    private val TAG = "RectShape"
    private var mConstantPointX = 0
    private var mConstantPointY = 0
    override fun touchDown(startX: Int, startY: Int) {
        super.touchDown(startX, startY)
        mConstantPointX = startX
        mConstantPointY = startY
    }

    override fun touchMove(currentX: Int, currentY: Int) {
        //mStartX,mStartY,mEndX,mEndY 代表矩形两个点
        //向右上方拖动
        if (mConstantPointX <= currentX && mConstantPointY >= currentY) {
            mStartY = currentY
            mEndX = currentX
        } else if (mConstantPointX >= currentX && mConstantPointY <= currentY) {
            mStartX = currentX
            mEndY = currentY
        } else if (mConstantPointX >= currentX && mConstantPointY >= currentY) {
            mStartX = currentX
            mStartY = currentY
            mEndX = mConstantPointX
            mEndY = mConstantPointY
        } else if (mConstantPointX <= currentX && mConstantPointY <= currentY) {
            mEndX = currentX
            mEndY = currentY
        }
        Log.e(
            "Rectangle",
            (" startX : $mStartX" + " startY : "
                    + mStartY) + " endX : " + mEndX + " endY : " + mEndY
        )
    }

    override fun draw(canvas: Canvas?) {
        if (mStartX === 0 && mStartY === 0) {
            return
        }
        val rect = Rect(mStartX, mStartY, mEndX, mEndY)
        canvas!!.drawRect(rect, mPaint)
    }
}