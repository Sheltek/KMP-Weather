package com.br.kmmdemo.network

import com.br.kmmdemo.network.dtos.ForecastDto

interface TomorrowIoService {
    suspend fun getForecastByCity(city: String): Result<ForecastDto>
}