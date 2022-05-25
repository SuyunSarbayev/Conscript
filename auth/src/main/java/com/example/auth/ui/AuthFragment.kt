package com.example.auth.ui

import android.os.Bundle
import android.view.View
import androidx.core.net.toUri
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.example.auth.R
import com.example.base.BaseFragment

class AuthFragment : BaseFragment() {

    override fun initializeLayout(): Int {
        return R.layout.fragment_auth
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initiateTransition()
    }

    override fun initializeToolbar() {}

    fun initiateTransition(){
        val request = NavDeepLinkRequest.Builder
            .fromUri("android-app://example.google.app/settings_fragment_two".toUri())
            .build()
        findNavController().navigate(request)
    }
}