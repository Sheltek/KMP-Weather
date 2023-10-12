package com.br.kmmdemo.di

import com.br.kmmdemo.Platform
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val platformModule = module {
    singleOf(::Platform)
}