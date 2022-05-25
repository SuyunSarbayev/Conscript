package com.example.weather

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.base.BaseFragment
import com.example.models.Location
import com.example.weather.adapter.WeatherAdapter
import com.example.weather.databinding.WeatherFragmentBinding

class WeatherFragment: BaseFragment<WeatherFragmentBinding>() {

    var adapter = WeatherAdapter(
        mutableListOf(Location(
            "Almaty",
            "10:45 am",
            "15 C",
            "cloudy"))
    )

    override fun initializeLayout(): Int = R.layout.fragment_weather

    override fun initializeToolbar() {
        activity?.supportActionBar?.title = ""
        activity?.supportActionBar?.hide()
        val decorView: View? = activity?.window?.getDecorView()
        val uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN
        decorView?.systemUiVisibility = uiOptions
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.adapter = adapter
        binding?.recyclerviewFragmentWeatherLocations?.layoutManager = LinearLayoutManager(requireContext())
        binding?.notifyChange()
    }
}