package com.br.kmmdemo

import com.br.kmmdemo.di.appModule
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin

class GreetingHelper : KoinComponent {
    fun greet() : String = "greeting.greeting()"
}

fun initKoin(){
    startKoin {
        modules(appModule())
    }
}