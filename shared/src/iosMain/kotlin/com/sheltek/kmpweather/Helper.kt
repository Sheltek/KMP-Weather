package com.sheltek.kmpweather

import com.sheltek.kmpweather.di.appModule
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin

class GreetingHelper : KoinComponent {
    fun greet() : String = "greeting.greeting()"
}

fun initKoin(){
    startKoin {
        modules(appModule())
    }
}