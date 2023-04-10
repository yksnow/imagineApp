package com.example.test.activity

import android.os.Bundle
import com.example.test.databinding.AcivityDrawBinding

class DrawActivity : BaseActivity() {
    private lateinit var drawBinding: AcivityDrawBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        drawBinding = AcivityDrawBinding.inflate(layoutInflater)
        setContentView(drawBinding.root)
        drawBinding.btnFinish.setOnClickListener {
            finish()
        }
    }
}