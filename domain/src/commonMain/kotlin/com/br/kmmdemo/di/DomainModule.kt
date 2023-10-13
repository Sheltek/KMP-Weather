package com.br.kmmdemo.di

import com.br.kmmdemo.network.KtorClient
import com.br.kmmdemo.network.TomorrowIoService
import com.br.kmmdemo.network.TomorrowIoServiceImpl
import com.br.kmmdemo.repositories.WeatherRepoImplementation
import com.br.kmmdemo.repositories.WeatherRepository
import com.br.kmmdemo.usecases.forecastusecase.ForecastForCityInteractor
import com.br.kmmdemo.viewmodels.ForecastViewModel
import org.koin.dsl.module

val domainModule = module {
    // Repositories
    single<WeatherRepository> { WeatherRepoImplementation() }

    // Services
    single<TomorrowIoService> { TomorrowIoServiceImpl() }

    // Clients
    single { KtorClient().client }
}

val useCaseModule = module {
    single { ForecastForCityInteractor() }
}

val viewModelModule = module {
    single { ForecastViewModel() }
}