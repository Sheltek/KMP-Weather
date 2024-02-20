package com.br.kmmdemo

import com.br.kmmdemo.models.Forecast

interface TomorrowIoService {
    suspend fun getForecastByCity(city: String): Result<Forecast>
}