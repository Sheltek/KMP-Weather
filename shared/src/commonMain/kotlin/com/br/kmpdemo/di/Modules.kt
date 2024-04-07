package com.br.kmpdemo.di

//import com.bottlerocketstudios.launchpad.google.utils.network.service.airquality.AirQualityApiService
import ForecastForCityInteractor
import KmpLocationProvider
import com.br.kmpdemo.network.ktorClient
import com.br.kmpdemo.network.service.TomorrowIoService
import com.br.kmpdemo.repositories.WeatherRepository
import com.br.kmpdemo.repository.WeatherRepoImplementation
import com.br.kmpdemo.usecases.forecastusecase.ForecastForCityUseCase
import com.br.kmpdemo.viewmodels.ForecastViewModel
import com.br.kmpdemo.viewmodels.HomeViewModel
import com.br.kmpdemo.viewmodels.MainActivityViewModel
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