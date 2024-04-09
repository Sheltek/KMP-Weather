package com.sheltek.kmpweather.android

import MeasurementPreference
import android.app.Application
import com.sheltek.kmpweather.android.di.androidModule
import com.sheltek.kmpweather.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class KmpWeatherApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@KmpWeatherApplication)
            androidLogger()
            modules(appModule() + androidModule)
        }
        MeasurementPreference.init(this)
    }
}