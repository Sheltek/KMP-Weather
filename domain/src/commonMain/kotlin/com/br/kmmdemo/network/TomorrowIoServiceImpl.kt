package com.br.kmmdemo.network

import com.br.kmmdemo.network.dtos.ForecastDto
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.url
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class TomorrowIoServiceImpl : TomorrowIoService, KoinComponent {
    // TODO - Once verified move this to DI
    //    private val client: HttpClient by inject()

    private val client: HttpClient by inject()

    override suspend fun getForecastByCity(city: String) =
        runCatching {
            client.get {
                url(path = "/forecast") {
//                url(Routes.FORECAST) {
                    parameters["location"] = city
//                    parameters["apikey"] = Routes.API_KEY
                }
            }.body<ForecastDto>()
        }
}
