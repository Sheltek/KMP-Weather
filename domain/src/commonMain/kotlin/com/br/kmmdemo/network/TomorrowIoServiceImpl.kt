package com.br.kmmdemo.network

import com.br.kmmdemo.network.dtos.ForecastDto
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.request.url
import io.ktor.http.parameters
import io.ktor.http.path
import io.ktor.serialization.kotlinx.json.json
import io.ktor.util.appendIfNameAbsent
import kotlinx.serialization.json.Json
import org.koin.core.component.KoinComponent

class TomorrowIoServiceImpl : TomorrowIoService, KoinComponent {
    // TODO - Once verified move this to DI
    //    private val client: HttpClient by inject()
    private val client = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
            })
        }
        install(DefaultRequest) {
//            host = Routes.BASE_URL
//            TODO - Investigate if this can work and just supply path segments in URL calls.
            parameters {
                appendIfNameAbsent("apikey", Routes.API_KEY)
            }
        }
    }

    override suspend fun getForecastByCity(city: String) =
        runCatching {
            client.get {
                url(Routes.FORECAST) {
                    parameters["location"] = city
                }
            }.body<ForecastDto>()
        }
}
