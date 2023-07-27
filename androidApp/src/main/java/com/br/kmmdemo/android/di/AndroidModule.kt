package com.br.kmmdemo.android.di

import com.br.kmmdemo.android.GreetPresenter
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module


val androidModule = module {
    singleOf(::GreetPresenter)
}