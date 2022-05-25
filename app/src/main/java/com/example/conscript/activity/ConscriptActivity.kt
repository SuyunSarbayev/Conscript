package com.example.conscript.activity

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.base.BaseActivity
import com.example.conscript.R
import com.example.conscript.databinding.ConscriptActivityBinding

class ConscriptActivity : BaseActivity() {

    lateinit var binding: ConscriptActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeBinding()
        initializeToolbar()
    }

    override fun initializeBinding() {
        binding = DataBindingUtil
            .setContentView(this, R.layout.activity_conscript)
    }

    override fun initializeToolbar() {
        toolbar = binding.toolbarActivityConscript
        setSupportActionBar(toolbar)
    }
}