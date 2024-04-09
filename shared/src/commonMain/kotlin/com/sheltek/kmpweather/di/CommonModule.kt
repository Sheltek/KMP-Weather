package com.sheltek.kmpweather.di

import com.sheltek.kmpweather.logger.KmpLogger
import com.sheltek.kmpweather.logger.KmpLoggerImpl
import org.koin.dsl.module

val commonModule = module {
    // Logger
    single<KmpLogger> { KmpLoggerImpl() }
}