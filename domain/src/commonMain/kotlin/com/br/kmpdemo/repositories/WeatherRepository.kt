package com.br.kmpdemo.repositories

import com.br.kmpdemo.models.Forecast

interface WeatherRepository {
    suspend fun getForecastForCity(city: String): Result<Forecast>
}