package com.example.network.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


var NetworkModule = module{
    single {
        provideRetrofit(get(), get())
        provideGSON()
        provideOkHttpClient()
    }
}

fun provideRetrofit(okHttpClient: OkHttpClient, gson: Gson): Retrofit =
    Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(okHttpClient)
        .baseUrl("https://community-open-weather-map.p.rapidapi.com/")
        .build()

fun provideGSON(): Gson =
    GsonBuilder()
        .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
        .create()


fun provideOkHttpClient(): OkHttpClient =
    OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor())
        .build()