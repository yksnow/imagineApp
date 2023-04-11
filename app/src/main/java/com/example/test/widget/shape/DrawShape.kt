package com.example.test.widget.shape

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.Log


/**
 * yaoletian on 2016/10/24.
 */
abstract class DrawShape {
    protected var mPaint: WritablePaint
    var mStartX = 0
        protected set
    var mStartY = 0
        protected set
    var mEndX = 0
        protected set
    var mEndY = 0
        protected set

    init {
        //注入BoardView对象
        mPaint = WritablePaint()
        mPaint.setAntiAlias(true)
        mPaint.setColor(mPaintColor)
        mPaint.setStyle(Paint.Style.STROKE)
        mPaint.setStrokeWidth(mPaintWidth)
        mPaint.setDither(true)
        mPaint.setStrokeJoin(Paint.Join.ROUND)
        mPaint.setStrokeCap(Paint.Cap.ROUND)
    }

    open fun touchDown(startX: Int, startY: Int) {
        this.mStartX = startX
        this.mStartY = startY
        Log.e("DrawShape_touchDown","start-x : " + this.mStartX + "  start-y : " + this.mStartY)
    }

    open fun touchUp(endX: Int, endY: Int) {
        this.mEndX = endX
        this.mEndY = endY
    }

    abstract fun touchMove(currentX: Int, currentY: Int)
    abstract fun draw(canvas: Canvas?)

    val paint: WritablePaint
        get() {
            mPaint.mColor = mPaintColor
            mPaint.mWidth = mPaintWidth
            return mPaint
        }

    companion object {
        var mPaintColor = Color.BLACK
        var mPaintWidth = 5f
    }

    open fun getStartX(): Int {
        return mStartX
    }

    open fun getStartY(): Int {
        return mStartY
    }

    open fun getEndX(): Int {
        return mEndX
    }

    open fun getEndY(): Int {
        return mEndY
    }
}