package com.ai.imageVideo.activity

import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.Toast
import com.ai.imageVideo.R
import com.ai.imageVideo.databinding.AcivityDrawBinding
import com.ai.imageVideo.utils.showToast
import com.ai.imageVideo.widget.shape.DrawShape
import com.ai.imageVideo.widget.shape.Type

class DrawActivity : BaseActivity(), View.OnClickListener{
    private lateinit var drawBinding: AcivityDrawBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        drawBinding = AcivityDrawBinding.inflate(layoutInflater)
        setContentView(drawBinding.root)
        with(drawBinding){
            ivBack.setOnClickListener(this@DrawActivity)
            ivCancel.setOnClickListener(this@DrawActivity)
            ivResume.setOnClickListener(this@DrawActivity)
            ivClearAll.setOnClickListener(this@DrawActivity)
            ivEraser.setOnClickListener(this@DrawActivity)
            ivDraw.setOnClickListener(this@DrawActivity)
            btnNext.setOnClickListener(this@DrawActivity)
            val numSize = DrawShape.mPaintWidth.toInt()
            seekBar.progress = numSize
            seekBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                    DrawShape.mPaintWidth = progress.toFloat()
                }

                override fun onStartTrackingTouch(seekBar: SeekBar) {}
                override fun onStopTrackingTouch(seekBar: SeekBar) {

                }
            })
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.iv_back->finish()
            R.id.iv_cancel->drawBinding.boardView.reCall()
            R.id.iv_resume->drawBinding.boardView.undo()
            R.id.iv_draw->drawBinding.boardView.setDrawType(Type.CURVE)
            R.id.iv_eraser->drawBinding.boardView.setDrawType(Type.WIPE)
            R.id.iv_clear_all-> drawBinding.boardView.clearScreen()
            R.id.btn_next->"暂无开发".showToast(Toast.LENGTH_SHORT)
        }
    }
}