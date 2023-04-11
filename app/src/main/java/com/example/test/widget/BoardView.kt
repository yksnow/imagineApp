package com.example.test.widget

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import com.example.test.utils.showToast
import com.example.test.widget.shape.*

/**
 * Created by linlongxin on 2016/10/24.
 */
class BoardView @JvmOverloads constructor(
    context: Context?,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    private val TAG = "BoardView"

    //类型：默认曲线
    private var mDrawType = Type.CURVE
    var drawBitmap: Bitmap? = null
        private set
    private var mCanvas: Canvas? = null
    private val mPaint //渲染画布
            : Paint
    private var mShape: DrawShape? = null
    private var isClearScreen = false
    private var isRecentRecallOrUndo = false
    val notePath: ArrayList<ShapeResource>
    private val mDeletePath: ArrayList<ShapeResource>
    private var mDownAction: OnDownAction? = null

    init {
        mPaint = Paint(Paint.DITHER_FLAG)
        notePath = ArrayList()
        mDeletePath = ArrayList()
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        val width = measuredWidth
        val height = measuredHeight
        drawBitmap = createBitmap(width, height)
    }

    override fun onDraw(canvas: Canvas) {
        //canvas绘制到mDrawBitmap
        canvas.drawBitmap(drawBitmap!!, 0f, 0f, mPaint)
        //绘制path到canvas
        if (mShape != null && !isClearScreen) {
            mShape!!.draw(canvas)
        } else if (isClearScreen) {
            isClearScreen = false
        }
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val currentX = event.x.toInt()
        val currentY = event.y.toInt()
        return when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                if (mDownAction != null) {
                    mDownAction!!.dealDownAction()
                }
                val mStartX = event.x.toInt()
                val mStartY = event.y.toInt()
                when (mDrawType) {
                    Type.CURVE -> mShape = CurveShape()
                    Type.WIPE -> mShape = WipeShape()
                    Type.RECTANGLE -> mShape = RectShape()
                    Type.OVAL -> mShape = OvalShape()
                    Type.LINE -> mShape = LineShape()
                    Type.MULTI_LINE -> mShape = MultiLineShape()
                }
                mShape!!.touchDown(mStartX, mStartY)
                true
            }
            MotionEvent.ACTION_MOVE -> {
                mShape!!.touchMove(currentX, currentY)
                invalidate()
                true
            }
            MotionEvent.ACTION_UP -> {
                mShape!!.touchUp(currentX, currentY)
                //把之前的path保存绘制到mDrawBitmap上
                val resource = ShapeResource()
                if (mShape is WipeShape) {
                    resource.mType = Type.WIPE
                    resource.mCurvePath = (mShape as CurveShape?)!!.path
                } else if (mShape is CurveShape) {
                    resource.mType = Type.CURVE
                    resource.mCurvePath = (mShape as CurveShape).path
                } else if (mShape is LineShape) {
                    saveShapeResource(resource, Type.LINE)
                } else if (mShape is OvalShape) {
                    saveShapeResource(resource, Type.OVAL)
                } else if (mShape is RectShape) {
                    saveShapeResource(resource, Type.RECTANGLE)
                } else if (mShape is MultiLineShape) {
                    //多边形分解成直线
                    saveShapeResource(resource, Type.LINE)
                }
                notePath.add(resource)
                invalidate()
                mShape!!.draw(mCanvas)
                true
            }
            else -> false
        }
    }

    //每次ACTION_UP事件保存路径参数
    fun saveShapeResource(resource: ShapeResource, type: Int) {
        resource.mType = type
        resource.mStartX = mShape!!.getStartX().toFloat()
        resource.mStartY = mShape!!.getStartY().toFloat()
        resource.mEndX = mShape!!.getEndX().toFloat()
        resource.mEndY = mShape!!.getEndY().toFloat()
        resource.mPaint = mShape!!.paint
    }

    //撤回
    fun reCall() {
        if (notePath.size == 0) {
            "对不起，不能撤回".showToast(Toast.LENGTH_LONG)
            return
        }
        val resource = notePath[notePath.size - 1]
        mDeletePath.add(resource)
        notePath.removeAt(notePath.size - 1)
        if (mShape is MultiLineShape) {
            MultiLineShape.setNewStartPoint(resource.mStartX, resource.mStartY)
        }
        updateBitmap()
        isRecentRecallOrUndo = true
    }

    //恢复
    fun undo() {
        if (mDeletePath.size == 0) {
            "对不起，不能恢复".showToast(Toast.LENGTH_LONG)
            return
        }
        val resource = mDeletePath[mDeletePath.size - 1]
        if (mShape is MultiLineShape) {
            if (resource.mStartX != MultiLineShape.mNextStartX || resource.mStartY != MultiLineShape.mNextStartY) {
                 "对不起，不能恢复".showToast(Toast.LENGTH_LONG)
                return
            } else {
                MultiLineShape.setNewStartPoint(resource.mEndX, resource.mEndY)
            }
        }
        notePath.add(resource)
        mDeletePath.removeAt(mDeletePath.size - 1)
        updateBitmap()
        isRecentRecallOrUndo = true
    }

    //更新bitmap
    fun updateBitmap() {
        drawBitmap!!.eraseColor(Color.WHITE)
        mCanvas = Canvas(drawBitmap!!)
        isClearScreen = true
        invalidate()
        for (resource in notePath) {
            when (resource.mType) {
                Type.WIPE, Type.CURVE -> mCanvas!!.drawPath(
                    resource.mCurvePath!!, resource.mCurvePath!!.mPaint!!
                )
                Type.LINE -> mCanvas!!.drawLine(
                    resource.mStartX, resource.mStartY,
                    resource.mEndX, resource.mEndY, resource.mPaint!!
                )
                Type.OVAL -> {
                    val rectF = RectF(
                        resource.mStartX, resource.mStartY,
                        resource.mEndX, resource.mEndY
                    )
                    mCanvas!!.drawOval(rectF, resource.mPaint!!)
                }
                Type.RECTANGLE -> mCanvas!!.drawRect(
                    resource.mStartX, resource.mStartY,
                    resource.mEndX, resource.mEndY, resource.mPaint!!
                )
            }
        }
    }

    //清屏
    fun clearScreen() {
        drawBitmap!!.eraseColor(Color.WHITE)
        mCanvas = Canvas(drawBitmap!!)
        notePath.clear()
        mDeletePath.clear()
        isClearScreen = true
        mShape = null
        MultiLineShape.clear()
        invalidate()
    }

    //从本地文件读取的笔迹
    fun updateDrawFromPaths(data: List<ShapeResource>) {
        clearScreen()
        notePath.addAll(data)
        loadBitmapFromLocal()
        Log.e("setDrawPaths:data.size=","" + data.size)
    }

    //加载本地文件笔迹
    fun loadBitmapFromLocal() {
        for (resource in notePath) {
            if (resource.mPaint != null) {
                resource.mPaint!!.loadPaint()
                Log.e("paint.color : ","" + resource.mPaint!!.color)
                Log.e("paint.width : ","" + resource.mPaint!!.strokeWidth)
            }
            when (resource.mType) {
                Type.WIPE, Type.CURVE -> {
                    resource.mCurvePath!!.loadPathPointsAsQuadTo()
                    resource.mCurvePath!!.mPaint!!.loadPaint()
                    mCanvas!!.drawPath(resource.mCurvePath!!, resource.mCurvePath!!.mPaint!!)
                }
                Type.LINE -> mCanvas!!.drawLine(
                    resource.mStartX, resource.mStartY,
                    resource.mEndX, resource.mEndY, resource.mPaint!!
                )
                Type.OVAL -> {
                    val rectF = RectF(
                        resource.mStartX, resource.mStartY,
                        resource.mEndX, resource.mEndY
                    )
                    mCanvas!!.drawOval(rectF, resource.mPaint!!)
                }
                Type.RECTANGLE -> mCanvas!!.drawRect(
                    resource.mStartX, resource.mStartY,
                    resource.mEndX, resource.mEndY, resource.mPaint!!
                )
            }
        }
    }

    fun setDrawType(type: Int) {
        //如果点击撤回或者恢复后重新绘制，则清空mDeletePath
        if (isRecentRecallOrUndo) {
            mDeletePath.clear()
            isRecentRecallOrUndo = false
        }
        mDrawType = type
    }

    //创建白色背景的bitmap
    fun createBitmap(width: Int, height: Int): Bitmap {
        val paint = Paint()
        paint.color = Color.WHITE
        val bitmap = Bitmap.createBitmap(
            width,
            height, Bitmap.Config.ARGB_8888
        )
        mCanvas = Canvas(bitmap)
        mCanvas!!.drawRect(0f, 0f, width.toFloat(), height.toFloat(), paint)
        mCanvas!!.drawBitmap(bitmap, 0f, 0f, paint)
        return bitmap
    }

    //暴露down事件给FloatViewGroup
    fun setOnDownAction(action: OnDownAction?) {
        mDownAction = action
    }

    interface OnDownAction {
        fun dealDownAction()
    }
}