package com.hefu.f_module_base.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hefu.module_base.R

class KBaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_k_base)
    }
}