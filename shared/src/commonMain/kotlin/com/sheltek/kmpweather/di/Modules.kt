package com.sheltek.kmpweather.di

import ForecastForCityInteractor
import KmpLocationProvider
import com.sheltek.kmpweather.network.ktorClient
import com.sheltek.kmpweather.network.service.TomorrowIoService
import com.sheltek.kmpweather.repositories.WeatherRepository
import com.sheltek.kmpweather.repository.WeatherRepoImplementation
import com.sheltek.kmpweather.usecases.forecastusecase.ForecastForCityUseCase
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