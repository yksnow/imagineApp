package com.example.test.widget

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class ColorView @JvmOverloads constructor(
    context: Context?,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    private var mWidth = 0
    private var mHeight = 0
    private val mCirclePaint: Paint
    private val mLinePaint: Paint
    private var isChecked = false

    init {
        mCirclePaint = Paint()
        mCirclePaint.isAntiAlias = true
        mCirclePaint.style = Paint.Style.FILL
        mLinePaint = Paint()
        mLinePaint.style = Paint.Style.STROKE
        mLinePaint.color = Color.WHITE
        mLinePaint.strokeWidth = 8f
        mLinePaint.isAntiAlias = true
        mLinePaint.isDither = true
        mLinePaint.strokeJoin = Paint.Join.ROUND
        mLinePaint.strokeCap = Paint.Cap.ROUND
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        mWidth = MeasureSpec.getSize(widthMeasureSpec)
        mHeight = mWidth
        setMeasuredDimension(mWidth, mHeight)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val x = (mWidth / 2).toFloat()
        val y = (mHeight / 2).toFloat()
        val r = (mWidth / 2).toFloat()
        canvas.drawCircle(x, y, r, mCirclePaint)
        if (isChecked) {
            val path = Path()
            val startX: Int
            val startY: Int
            startX = mWidth / 5
            startY = mHeight / 7 * 4
            path.moveTo(startX.toFloat(), startY.toFloat())
            //先只考虑width == height;后期完善
            val midX = mWidth / 5 * 2
            val midY = mHeight / 4 * 3
            path.lineTo(midX.toFloat(), midY.toFloat())
            val endX = mWidth / 5 * 4
            val endY = mHeight / 3
            path.lineTo(endX.toFloat(), endY.toFloat())
            canvas.drawPath(path, mLinePaint)
        }
    }

    fun setColor(color: Int, isChecked: Boolean) {
        mCirclePaint.color = color
        this.isChecked = isChecked
        invalidate()
    }

    fun setChecked(isChecked: Boolean) {
        if (this.isChecked != isChecked) {
            this.isChecked = isChecked
            invalidate()
        }
    }
}