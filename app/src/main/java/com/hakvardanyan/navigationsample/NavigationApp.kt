package com.hakvardanyan.navigationsample

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class NavigationApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@NavigationApp)
            modules(singleModule)
        }
    }
}