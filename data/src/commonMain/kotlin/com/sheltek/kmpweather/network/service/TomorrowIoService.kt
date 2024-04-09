package com.sheltek.kmpweather.network.service

import com.sheltek.kmpweather.dtos.ForecastDto
import com.sheltek.kmpweather.dtos.RealTimeDto
import com.sheltek.kmpweather.network.NetworkRoutes.DAILY_FORECAST
import com.sheltek.kmpweather.network.NetworkRoutes.FORECAST_URL
import com.sheltek.kmpweather.network.NetworkRoutes.HOURLY_FORECAST
import com.sheltek.kmpweather.network.NetworkRoutes.REALTIME_URL
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.url
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject


class TomorrowIoService : KoinComponent {
    private val client: HttpClient by inject()

    companion object {
        const val LOCATION = "location"
        const val UNITS = "units"
        const val TIME_STEPS = "timesteps"
        const val API_KEY = "apikey"
        /// FIXME: Extract
        const val GOOGLE_MAPS_API_KEY = "AIzaSyAmrvwsp5e0OsXUtwMZrh1u4TD8PbOqe0o"
    }

//    suspend fun getForecastByCity(city: String) =
//        runCatching {
//            client.get {
//                url(path = FORECAST_URL) {
//                    parameters[LOCATION] = city
//                }
//            }.body<ForecastDto>()
//        }

    suspend fun getDailyForecast(
        location: String,
        units: String,
    ): Result<ForecastDto> =
        runCatching {
            client.get {
                url(path = FORECAST_URL) {
                    parameters[LOCATION] = location
                    parameters[TIME_STEPS] = DAILY_FORECAST
                    parameters[UNITS] = units
                }
            }.body<ForecastDto>()
        }

    suspend fun getHourlyForecast(
        location: String,
        units: String,
    ): Result<ForecastDto> =
        runCatching {
            client.get {
                url(path = FORECAST_URL) {
                    parameters[LOCATION] = location
                    parameters[TIME_STEPS] = HOURLY_FORECAST
                    parameters[UNITS] = units
                }
            }.body<ForecastDto>()
        }

    suspend fun getRealTimeForecast(
        location: String,
        units: String,
    ): Result<RealTimeDto> =
        runCatching {
            client.get {
                url(path = REALTIME_URL) {
                    parameters[LOCATION] = location
                    parameters[UNITS] = units
                }
            }.body<RealTimeDto>()
        }
}
