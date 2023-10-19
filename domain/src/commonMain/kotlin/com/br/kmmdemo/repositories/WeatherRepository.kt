package com.br.kmmdemo.repositories

import com.br.kmmdemo.network.dtos.ForecastDto

interface WeatherRepository {
    suspend fun getForecastForCity(city: String): Result<ForecastDto>
}