package com.br.kmmdemo.android

import androidx.multidex.MultiDexApplication
import com.br.kmmdemo.android.di.androidModule
import com.br.kmmdemo.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class KmmDemoApplication: MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@KmmDemoApplication)
            androidLogger()
            modules(appModule() + androidModule)
        }
    }
}