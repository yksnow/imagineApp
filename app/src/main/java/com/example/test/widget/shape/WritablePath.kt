package com.example.test.widget.shape

import android.graphics.Path
import java.io.Serializable

class WritablePath : Path(), Serializable {
    var mPaint: WritablePaint? = null
    private val mPathPoints: ArrayList<FloatArray>

    init {
        mPathPoints = ArrayList()
    }

    fun addPathPoints(points: FloatArray) {
        mPathPoints.add(points)
    }

    fun loadPathPointsAsQuadTo() {
        val initPoints = mPathPoints.removeAt(0)
        moveTo(initPoints[0], initPoints[1])
        for (points in mPathPoints) {
            quadTo(points[0], points[1], points[2], points[3])
        }
    }

    companion object {
        private const val serialVersionUID = 1L
    }
}