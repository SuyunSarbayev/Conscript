package com.example.weather.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.models.Location
import com.example.weather.databinding.LocationBinding

class WeatherAdapter(var locations: MutableList<Location>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = LocationBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LocationWeatherViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as LocationWeatherViewHolder).locationBinding?.locaion = locations.get(position)
    }

    override fun getItemCount(): Int {
        return locations.size
    }

    class LocationWeatherViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var locationBinding: LocationBinding? = null

        init {
            locationBinding = DataBindingUtil.bind(itemView)
        }
    }
}