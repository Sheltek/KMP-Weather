package com.br.kmmdemo.di

import com.br.kmmdemo.logger.KmpLogger
import com.br.kmmdemo.logger.KmpLoggerImpl
import org.koin.dsl.module

val commonModule = module {
    // Logger
    single<KmpLogger> { KmpLoggerImpl() }
}