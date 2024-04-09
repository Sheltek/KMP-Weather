package com.sheltek.kmpweather.repositories

import com.sheltek.kmpweather.models.Forecast
import com.sheltek.kmpweather.models.RealTime

interface WeatherRepository {
//    suspend fun getForecastForCity(city: String): Result<Forecast>
    suspend fun getDailyForecast(location: String, units: String): Result<com.sheltek.kmpweather.models.Forecast?>
    suspend fun getHourlyForecast(location: String, units: String): Result<com.sheltek.kmpweather.models.Forecast?>
    suspend fun getRealTimeForecast(location: String, units: String): Result<com.sheltek.kmpweather.models.RealTime?>
}