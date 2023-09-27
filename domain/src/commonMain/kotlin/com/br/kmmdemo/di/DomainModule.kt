package com.br.kmmdemo.di

import com.br.kmmdemo.network.TomorrowIoService
import com.br.kmmdemo.network.TomorrowIoServiceImpl
import com.br.kmmdemo.repositories.WeatherImplementation
import com.br.kmmdemo.repositories.WeatherRepository
import com.br.kmmdemo.usecases.loginusecase.LoginInteractor
import com.br.kmmdemo.usecases.loginusecase.LoginUseCase
import org.koin.dsl.module

val domainModule = module {
    // Use Cases
    single<LoginUseCase> { LoginInteractor() }

    // Repositories
    single<WeatherRepository> { WeatherImplementation() }

    // Services
    single<TomorrowIoService> { TomorrowIoServiceImpl() }
}