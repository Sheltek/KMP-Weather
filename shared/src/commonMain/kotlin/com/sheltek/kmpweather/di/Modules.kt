package com.sheltek.kmpweather.di

import ForecastForCityInteractor
import KmpLocationProvider
import com.br.kmpdemo.network.ktorClient
import com.br.kmpdemo.network.service.TomorrowIoService
import com.br.kmpdemo.repositories.WeatherRepository
import com.br.kmpdemo.repository.WeatherRepoImplementation
import com.br.kmpdemo.usecases.forecastusecase.ForecastForCityUseCase
import com.sheltek.kmpweather.viewmodels.ForecastViewModel
import com.sheltek.kmpweather.viewmodels.HomeViewModel
import com.sheltek.kmpweather.viewmodels.MainActivityViewModel
import com.sheltek.kwikstart.utils.coroutine.DispatcherProvider
import com.sheltek.kwikstart.utils.coroutine.DispatcherProviderImpl
import io.ktor.client.HttpClient
import org.koin.dsl.module

val domainModule = module {
    // Injection from utils lib
    single<DispatcherProvider> { DispatcherProviderImpl() }

    // Repositories
    single<WeatherRepository> { WeatherRepoImplementation() }

    // Services
    single<TomorrowIoService> { TomorrowIoService() }

    // Clients
    single<HttpClient> { ktorClient() }
}

val useCaseModule = module {
    single<ForecastForCityUseCase> { ForecastForCityInteractor() }
}

val viewModelModule = module {
    single { ForecastViewModel() }
    single { HomeViewModel() }
    single { MainActivityViewModel() }
    single { KmpLocationProvider() }
}

val repositoryModule = module {
    single<WeatherRepository> { WeatherRepoImplementation() }
//    single<AirQualityApiService> { AirQualityApiService(GOOGLE_MAPS_API_KEY) }
}