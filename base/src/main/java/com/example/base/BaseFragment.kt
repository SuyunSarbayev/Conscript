package com.example.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<T : ViewDataBinding>: Fragment(){

    var rootView: View? = null

    var activity: BaseActivity? = null

    var binding: T? = null

    abstract fun initializeLayout() : Int

    abstract fun initializeToolbar()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if(binding == null){
            initializeBinding(inflater, initializeLayout(), container)
        }
        initializeActivity()
        initializeToolbar()
        return binding?.root
    }

    fun initializeActivity(){
        activity = (requireActivity() as BaseActivity)
    }

    fun initializeBinding(inflater: LayoutInflater, contentId: Int, container: ViewGroup?) {
        binding = DataBindingUtil.inflate(inflater, contentId, container, false)
    }
}