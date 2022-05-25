package com.example.weather.di

import com.example.weather.network.ApiWeather
import org.koin.dsl.module
import retrofit2.Retrofit

var weatherModuleDi = module{
    factory { providesWeatherApi(get()) }
}

fun providesWeatherApi(retrofit: Retrofit): ApiWeather{
    return retrofit.create(ApiWeather::class.java)
}