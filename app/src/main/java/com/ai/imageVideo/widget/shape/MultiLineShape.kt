package com.ai.imageVideo.widget.shape

import android.graphics.Canvas
import android.util.Log

/**
 * Created by user on 2016/10/27.
 */
class MultiLineShape : DrawShape() {
    override fun touchDown(startX: Int, startY: Int) {
        if (mNextStartX == -1f && mNextStartY == -1f) {
            mStartX = startX
            mStartY = startY
            mPath.moveTo(startX.toFloat(), startY.toFloat())
        } else {
            mStartX = mNextStartX.toInt()
            mStartY = mNextStartY.toInt()
        }
    }

    override fun touchMove(currentX: Int, currentY: Int) {
        mEndX = currentX
        mEndY = currentY
    }

    override fun touchUp(endX: Int, endY: Int) {
        super.touchUp(endX, endY) //给他们赋值
        mPath.lineTo(endX.toFloat(), endY.toFloat())
        mNextStartX = endX.toFloat()
        mNextStartY = endY.toFloat()
    }

    override fun draw(canvas: Canvas?) {
        if (mEndX == 0 && mEndY == 0) {
            return
        }
        if (mStartX != mEndX || mStartY != mEndY) {
            canvas!!.drawLine(
                mStartX.toFloat(),
                mStartY.toFloat(),
                mEndX.toFloat(),
                mEndY.toFloat(),
                mPaint
           )
            Log.e(
                "MultiLineShape", "start-x:"+ mStartX + "  start-y : " + mStartY +
                        "  end-x : " + mEndX + "  end-y : " + mEndY
            )
        }
    }
    fun getNextPointX(): Float {
        return mNextStartX
    }

    fun getNextPointY(): Float {
        return mNextStartY
    }
    companion object {
        private val mPath = WritablePath()
        var mNextStartX = -1f
            private set
        var mNextStartY = -1f
            private set

        fun clear() {
            mNextStartX = -1f
            mNextStartY = -1f
        }

        fun setNewStartPoint(x: Float, y: Float) {
            mNextStartX = x
            mNextStartY = y
        }
    }
}