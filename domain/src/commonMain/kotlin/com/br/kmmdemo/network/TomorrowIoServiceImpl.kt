package com.br.kmmdemo.network

import com.br.kmmdemo.network.dtos.ForecastDto
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.url

class TomorrowIoServiceImpl(
    private val client: HttpClient
) : TomorrowIoService {
    override suspend fun getForecastByCity(city: String): ForecastDto? {
        return try {
            //TODO change this to return Kotlin Result <ForecastDto?>
            client.get { url(Routes.FORECAST) }.body<ForecastDto?>()
        } catch (e: Exception) {
            //TODO change this to return Kotlin Result Error
            null
        }
    }
}