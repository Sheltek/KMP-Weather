package com.br.kmpdemo.repository

import com.br.kmpdemo.TomorrowIoService
import com.br.kmpdemo.models.Forecast
import com.br.kmpdemo.repositories.WeatherRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class WeatherRepoImplementation : WeatherRepository, KoinComponent {
    private val tomorrowIoService: TomorrowIoService by inject()
    override suspend fun getForecastForCity(city: String): Result<Forecast> {
        return tomorrowIoService.getForecastByCity(city)
    }
}