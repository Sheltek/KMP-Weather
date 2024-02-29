package com.br.kmpdemo.network.service

import com.br.kmpdemo.dtos.ForecastDto
import com.br.kmpdemo.dtos.RealTimeDto
import com.br.kmpdemo.network.NetworkRoutes
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.url
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class TomorrowIoService : KoinComponent {
    private val client: HttpClient by inject()

    suspend fun getForecastByCity(city: String) =
        runCatching {
            client.get {
                url(path = "/forecast") {
                    parameters["location"] = city
                }
            }.body<ForecastDto>()
        }

    suspend fun getDailyForecast(
        location: String,
        units: String,
    ): Result<ForecastDto> =
        runCatching {
            client.get {
                url(NetworkRoutes.getDailyForecast(location, units))
            }.body<ForecastDto>()
        }

    suspend fun getHourlyForecast(
        location: String,
        units: String,
    ): Result<ForecastDto> =
        runCatching {
            client.get {
                url(NetworkRoutes.getHourlyForecast(location, units))
            }.body<ForecastDto>()
        }

    suspend fun getRealTimeForecast(
        location: String,
        units: String,
    ): Result<RealTimeDto> =
        runCatching {
            client.get {
                url(NetworkRoutes.getRealTimeForecast(location, units))
            }.body<RealTimeDto>()
        }
}
