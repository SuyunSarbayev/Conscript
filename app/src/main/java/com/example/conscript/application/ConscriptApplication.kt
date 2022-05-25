package com.example.conscript.application

import android.app.Application
import com.example.network.di.NetworkModule
import org.koin.core.context.GlobalContext.startKoin

class ConscriptApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initializeKoin()
    }

    fun initializeKoin(){
        startKoin {
            modules(
                NetworkModule,
            )
        }
    }
}