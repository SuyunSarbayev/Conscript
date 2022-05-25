package com.example.weather.network

import com.example.network.endpoint.ApiEndpoints
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface ApiWeather {
    @GET(ApiEndpoints.currentWeather)
    fun initiateRequestWeather(@QueryMap data: Map<String, Any>)
}