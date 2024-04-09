package com.sheltek.kmpweather.repository

import com.sheltek.kmpweather.converters.toForecastModel
import com.sheltek.kmpweather.converters.toRealTimeModel
import com.sheltek.kmpweather.network.service.TomorrowIoService
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class WeatherRepoImplementation : com.sheltek.kmpweather.repositories.WeatherRepository, KoinComponent {
    private val tomorrowIoService: TomorrowIoService by inject()

//    override suspend fun getForecastForCity(city: String): Result<Forecast> =
//        tomorrowIoService
//            .getForecastByCity(city)
//            .map { it.toForecastModel() }

    override suspend fun getDailyForecast(location: String, units: String): Result<com.sheltek.kmpweather.models.Forecast?> =
        tomorrowIoService
            .getDailyForecast(location, units)
            .map { it.toForecastModel() }

    override suspend fun getHourlyForecast(location: String, units: String): Result<com.sheltek.kmpweather.models.Forecast?> =
        tomorrowIoService
            .getHourlyForecast(location, units)
            .map { it.toForecastModel() }

    override suspend fun getRealTimeForecast(location: String, units: String): Result<com.sheltek.kmpweather.models.RealTime> =
        tomorrowIoService
            .getRealTimeForecast(location, units)
            .map { it.toRealTimeModel() }
}