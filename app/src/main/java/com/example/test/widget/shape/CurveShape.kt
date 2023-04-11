package com.example.test.widget.shape

import android.graphics.Canvas
import android.graphics.Rect

//曲线
open class CurveShape : DrawShape() {
    private val mRect: Rect
    protected var mPath: WritablePath

    init {
        mPath = WritablePath()
        mRect = Rect()
    }

    override fun touchDown(startX: Int, startY: Int) {
        super.touchDown(startX, startY)
        //设置曲线开始点
        mPath.moveTo(startX.toFloat(), startY.toFloat())
        val a = floatArrayOf(startX.toFloat(), startY.toFloat(), 0f, 0f)
        mPath.addPathPoints(a)
    }

    override fun touchMove(currentX: Int, currentY: Int) {
        val border = mPaint.strokeWidth.toInt()
        mRect[mStartX - border, mStartY - border, mStartX + border] = mStartY + border
        val mMiddleX = ((currentX + mStartX) / 2).toFloat()
        val mMiddleY = ((currentY + mStartY) / 2).toFloat()

        // 贝赛尔曲线
        mPath.quadTo(mStartX.toFloat(), mStartY.toFloat(), mMiddleX, mMiddleY)
        val temp = floatArrayOf(mStartX.toFloat(), mStartY.toFloat(), mMiddleX, mMiddleY)
        mPath.addPathPoints(temp)

        //重新计算Rect的范围
        mRect.union(
            mMiddleX.toInt() - border,
            mMiddleY.toInt() - border,
            mMiddleX.toInt() + border,
            mMiddleY.toInt() + border
        )
        mStartX = currentX
        mStartY = currentY
    }

    //把曲线绘制到画布上
    override fun draw(canvas: Canvas?) {
        canvas!!.drawPath(mPath, mPaint)
    }

    open val path: WritablePath
        get() {
            mPaint.mColor = mPaintColor
            mPaint.mWidth = mPaintWidth
            mPath.mPaint = mPaint
            return mPath
        }
}