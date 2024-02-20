package com.br.kmmdemo.repositories

import com.br.kmmdemo.models.Forecast

interface WeatherRepository {
    suspend fun getForecastForCity(city: String): Result<Forecast>
}