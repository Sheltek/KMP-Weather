package com.br.kmmdemo.repositories

import com.br.kmmdemo.network.TomorrowIoService
import com.br.kmmdemo.network.dtos.ForecastDto
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class WeatherRepoImplementation : WeatherRepository, KoinComponent {
    private val tomorrowIoService: TomorrowIoService by inject()
    suspend fun getForecastForCity(city: String): Result<ForecastDto> {
        return tomorrowIoService.getForecastByCity(city)
    }
}