package com.example.test.widget.shape

import java.io.Serializable

/**
 * Created by linlongxin on 2016/10/26.
 */
class ShapeResource : Serializable {
    var mType = 0
    var mStartX = 0f
    var mStartY = 0f
    var mEndX = 0f
    var mEndY = 0f
    var mPaint: WritablePaint? = null

    //针对曲线：包含了一个WritablePaint
    var mCurvePath: WritablePath? = null
}