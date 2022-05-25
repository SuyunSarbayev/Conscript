package com.example.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.base.ConscriptFragment

class SplashFragment : ConscriptFragment() {

    override fun initializeLayout(): Int {
        return R.layout.fragment_splash
    }

    override fun initializeToolbar() {
        activity?.title = "Привет"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        initializeToolbar()
        return rootView
    }
}