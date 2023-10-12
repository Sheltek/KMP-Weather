package com.br.kmmdemo.di

import com.br.kmmdemo.KtorClient
import io.ktor.client.HttpClient
import org.koin.dsl.module

val clientModule = module {
    single<HttpClient>{ KtorClient().client }
}