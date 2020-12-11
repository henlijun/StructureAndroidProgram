package com.hefu.f_module_base.java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hefu.module_base.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
}