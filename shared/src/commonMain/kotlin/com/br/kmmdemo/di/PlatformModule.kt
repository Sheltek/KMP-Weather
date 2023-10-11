package com.br.kmmdemo.di

import com.br.kmmdemo.Platform
import io.ktor.client.HttpClient
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val platformModule = module {
    singleOf(::Platform)
    single<HttpClient> { Platform().client }
}