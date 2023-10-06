package com.br.kmmdemo.di

import com.br.kmmdemo.network.TomorrowIoService
import com.br.kmmdemo.network.TomorrowIoServiceImpl
import com.br.kmmdemo.repositories.WeatherRepoImplementation
import com.br.kmmdemo.repositories.WeatherRepository
import com.br.kmmdemo.usecases.forecastusecase.ForecastForCityInteractor
import com.br.kmmdemo.usecases.loginusecase.LoginInteractor
import com.br.kmmdemo.usecases.loginusecase.LoginUseCase
import com.br.kmmdemo.viewmodels.ForecastViewModel
import org.koin.dsl.module

val domainModule = module {
    // Use Cases
    single<LoginUseCase> { LoginInteractor() }

    // Repositories
    single<WeatherRepository> { WeatherRepoImplementation() }

    // Services
    single<TomorrowIoService> { TomorrowIoServiceImpl() }
}

val useCaseModule = module {
    single<ForecastForCityInteractor> { ForecastForCityInteractor() }
}

val viewModelModule = module {
    single<ForecastViewModel> { ForecastViewModel() }
}