package com.ai.imageVideo.widget.shape

import android.graphics.Canvas

class LineShape : DrawShape() {
    override fun touchMove(currentX: Int, currentY: Int) {
        mEndX = currentX
        mEndY = currentY
    }

    //ACTION_MOVE更新画布，调用这里
    override fun draw(canvas: Canvas?) {
        if (mEndX === 0 && mEndY === 0) {
            return
        }
        canvas!!.drawLine(mStartX.toFloat(), mStartY.toFloat(), mEndX.toFloat(),
            mEndY.toFloat(), mPaint)
    }
}