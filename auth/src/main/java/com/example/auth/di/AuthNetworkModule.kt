package com.example.auth.network

import org.koin.dsl.module
import retrofit2.Retrofit

var AuthNetworkModule = module {
    single {
        providesAuthApiService(get())
    }
}

fun providesAuthApiService(retrofit: Retrofit): AuthApi =
    retrofit.create(AuthApi::class.java)