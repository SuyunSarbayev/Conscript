package com.example.base

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

abstract class BaseActivity: AppCompatActivity() {
    var toolbar: Toolbar? = null

    abstract fun initializeBinding()

    abstract fun initializeToolbar()
}