package com.br.kmmdemo.repository

import com.br.kmmdemo.TomorrowIoService
import com.br.kmmdemo.models.Forecast
import com.br.kmmdemo.repositories.WeatherRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class WeatherRepoImplementation : WeatherRepository, KoinComponent {
    private val tomorrowIoService: TomorrowIoService by inject()
    override suspend fun getForecastForCity(city: String): Result<Forecast> {
        return tomorrowIoService.getForecastByCity(city)
    }
}