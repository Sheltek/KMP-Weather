package com.br.kmmdemo

import com.br.kmmdemo.network.Routes
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.headers
import io.ktor.http.URLProtocol
import io.ktor.serialization.kotlinx.json.json
import io.ktor.util.appendIfNameAbsent
import kotlinx.serialization.json.Json
import org.koin.core.component.KoinComponent

class KtorClient: KoinComponent {
    val client: HttpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
                encodeDefaults = true
            })
        }

        defaultRequest {
            url {
                protocol = URLProtocol.HTTPS
                host = Routes.BASE_HOST
                headers {
                    appendIfNameAbsent("apikey", Routes.API_KEY)
                }
            }
        }
    }
}