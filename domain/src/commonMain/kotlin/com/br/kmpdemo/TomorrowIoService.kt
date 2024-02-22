package com.br.kmpdemo

import com.br.kmpdemo.models.Forecast

interface TomorrowIoService {
    suspend fun getForecastByCity(city: String): Result<Forecast>
}